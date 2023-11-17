package com.example.department_diplom.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "note_about_number_tools")
public class NoteAboutNumberTools {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "employees_id")
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "tools_id")
    private Tool tool;
    private int amount;

    public NoteAboutNumberTools(Employee employee, Tool tool, int amount) {
        this.employee = employee;
        this.tool = tool;
        this.amount = amount;
    }
}

