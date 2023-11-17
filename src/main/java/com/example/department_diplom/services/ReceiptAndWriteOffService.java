package com.example.department_diplom.services;

import com.example.department_diplom.models.ReceiptAndWriteOff;
import com.example.department_diplom.repositories.ReceiptAndWriteOffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceiptAndWriteOffService {
    ReceiptAndWriteOffRepository receiptAndWriteOffRepository;

    public ReceiptAndWriteOffService(ReceiptAndWriteOffRepository receiptAndWriteOffRepository) {
        this.receiptAndWriteOffRepository = receiptAndWriteOffRepository;
    }

    public List<ReceiptAndWriteOff> getAllInformation(){
        return receiptAndWriteOffRepository.findAll();
    }
}
