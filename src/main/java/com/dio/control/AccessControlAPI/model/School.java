package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class School {
    @Id
    private long id;
    private String description;
    private String address;
    private String city;
    private String state;
    private String country;
    private String telephone;
}
