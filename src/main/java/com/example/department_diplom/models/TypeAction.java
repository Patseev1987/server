package com.example.department_diplom.models;

public enum TypeAction {
    RECEIPT("Получение инструмента"), WRITE_OFF("Списание инструмента");
    private String type;

    TypeAction(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
