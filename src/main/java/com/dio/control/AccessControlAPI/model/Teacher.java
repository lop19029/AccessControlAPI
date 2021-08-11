package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Teacher {

    @Id
    private long id;

    private String nome;

    @ManyToOne
    private School school;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private WorkSchedule workSchedule;
    
    private LocalDateTime workDayStartTime;
    private LocalDateTime workDayEndTime;

}
