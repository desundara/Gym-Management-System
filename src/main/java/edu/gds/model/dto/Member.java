package edu.gds.model.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Member {

    private String memberId;
    private String name;
    private String  email;
    private String address;
    private LocalDate dob;
    private double bmi;
    private String phoneNumber;
    private double registrationFee;
    private double subscription;

}
