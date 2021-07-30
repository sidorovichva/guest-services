package com.vs.guestservices;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
@Data
@Component
public class Guest {
    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    private String address;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "STATE")
    private String state;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
}
