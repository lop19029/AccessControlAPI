package com.dio.control.AccessControlAPI.model;

import jdk.jfr.Enabled;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Enabled
@Entity
public class StudentLevel {
    @Id
    private long id;
    private String description;
}
