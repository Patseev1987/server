package com.example.department_diplom.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@Entity
@Table(name = "tools")
public class Tool {
    @Id
    @Column(name = "id_code")
    private String idCode;
    @Column(name = "name")
    private String shortName;
    @Column (name = "full_name")
    private String fullName;
    @Column (name = "manufactured")
    private String manufactured;
    @Column (name = "kit_number")
    private Integer kitNumber;
    @Column (name = "is_good")
    private boolean isGood;
    @Column (name = "next_check")
    private LocalDate nextCheck;
    @Column (name = "type")
    @Enumerated(EnumType.STRING)
    private ToolType type;

    public Tool(String idCode, String shortName, String fullName, String manufactured, ToolType type) {
        this.idCode = idCode;
        this.shortName = shortName;
        this.fullName = fullName;
        this.manufactured = manufactured;
        this.type = type;
        isGood = true;
    }

    public Tool(String idCode, String shortName, String fullName, String manufactured, Integer kitNumber, boolean isGood, LocalDate nextCheck, ToolType type) {
        this.idCode = idCode;
        this.shortName = shortName;
        this.fullName = fullName;
        this.manufactured = manufactured;
        this.kitNumber = kitNumber;
        this.isGood = isGood;
        this.nextCheck = nextCheck;
        this.type = type;
    }
}
