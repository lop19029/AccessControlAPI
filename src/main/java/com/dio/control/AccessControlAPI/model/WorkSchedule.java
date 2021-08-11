package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class WorkSchedule {
    @Id
    @GeneratedValue
    private long id;
    private String description;
}
