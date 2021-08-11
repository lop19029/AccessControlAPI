package com.dio.control.AccessControlAPI.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Student {
    @Id
    private long id;

    private String nome;

    @ManyToOne
    private School school;

    @ManyToOne
    private AccessLevel accessLevel;

    @ManyToOne
    private StudentLevel studentLevel;

}
