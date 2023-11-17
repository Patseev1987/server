package com.example.department_diplom.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "receipt_and_write_off")
public class ReceiptAndWriteOff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private TypeAction type;
    @ManyToOne
    @JoinColumn(name = "tools_id")
    private Tool tool;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "create_date")
    private LocalDate createDate;
}
