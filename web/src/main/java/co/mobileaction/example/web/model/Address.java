package co.mobileaction.example.web.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@Data
public class Address {

    @Column(name = "street")
    String street;

    @Column(name = "suite")
    String suite;

    @Column(name = "city")
    String city;

    @Column(name = "zipcode")
    String zipcode;
}
