package co.mobileaction.example.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "username")
    String userName;

    @Column(name = "email")
    String email;

    @Embedded
    Address address;

    @Column(name = "phone")
    String phone;

    @Column(name = "website")
    String website;

    @Embedded
    Company company;
}
