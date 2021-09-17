package co.mobileaction.example.web.service;

import java.util.List;

public interface IUserQueueService {

    void sendRequestForDistinctUserIds(List<Long> userIds);
}
