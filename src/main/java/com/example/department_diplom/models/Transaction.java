package com.example.department_diplom.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "tools_id")
    private Tool tool;
    @ManyToOne
    @JoinColumn(name = "from_id")
    private Employee fromEmployee;
    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Employee destinationEmployee;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "create_date")
    private LocalDate createDate;



}
