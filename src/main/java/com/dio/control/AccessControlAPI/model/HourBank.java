package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HourBank {

    @EqualsAndHashCode
    @Embeddable
    @Getter
    @Setter
    public class HourBankId implements Serializable{
        private long idHourBank;
        private long idClass;
        private long idTeacher;
    }
    @Id
    @EmbeddedId
    private HourBankId id;

    private LocalDateTime classDate;
    private String numberOfHoursWorked;
    private String hoursWorkedBalance;
}
