package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Class {

    //Composed key
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class ClassId implements Serializable {
        private long idClass;
        private long idTeacher;
        private long idStudent;
    }
    @Id
    @EmbeddedId
    private ClassId id;

    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @ManyToOne
    private ClassType classType;

    @ManyToOne
    private Calendar calendar;
}
