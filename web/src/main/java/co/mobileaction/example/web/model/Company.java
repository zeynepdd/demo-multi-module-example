package co.mobileaction.example.web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@Data
public class Company {
    @Column(name = "companyname")
    String companyName;

    @Column(name = "catchphrase")
    String catchPhrase;

    @Column(name = "bs")
    String bs;
}
