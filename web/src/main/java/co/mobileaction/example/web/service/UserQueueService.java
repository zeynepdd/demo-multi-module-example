package co.mobileaction.example.web.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserQueueService implements IUserQueueService {

    private final AmqpTemplate requestQueueTemplate;

    private final IUserService userService;

    @Override
    public void sendRequestForDistinctUserIds(List<Long> userIds) {
        List<Long> distinctUsers = userService.findDistinctUsers();
        distinctUsers.forEach(requestQueueTemplate::convertAndSend);
    }
}
