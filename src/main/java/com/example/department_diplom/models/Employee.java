package com.example.department_diplom.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column (name = "name")
    private String name;
    @Column (name = "lastname")
    private String lastname;
    @Column (name = "patronymic")
    private String patronymic;
    @Column (name = "join_date")
    private LocalDate joinDate;

    public Employee(String name, String lastname, String patronymic, LocalDate joinDate) {
        this.name = name;
        this.lastname = lastname;
        this.patronymic = patronymic;
        this.joinDate = joinDate;
    }
}
