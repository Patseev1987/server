package com.example.department_diplom.services;

import com.example.department_diplom.models.Transaction;
import com.example.department_diplom.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions(){
       return transactionRepository.findAll();
    }
}
