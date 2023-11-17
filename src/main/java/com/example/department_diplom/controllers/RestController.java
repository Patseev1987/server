package com.example.department_diplom.controllers;

import com.example.department_diplom.models.NoteAboutNumberTools;
import com.example.department_diplom.models.ReceiptAndWriteOff;
import com.example.department_diplom.models.Transaction;
import com.example.department_diplom.services.NoteService;
import com.example.department_diplom.services.ReceiptAndWriteOffService;
import com.example.department_diplom.services.TransactionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    NoteService noteService;
    TransactionService transactionService;
    ReceiptAndWriteOffService receiptAndWriteOffService;

    public RestController(NoteService noteService,TransactionService transactionService, ReceiptAndWriteOffService receiptAndWriteOffService) {
        this.noteService = noteService;
        this.transactionService = transactionService;
        this.receiptAndWriteOffService = receiptAndWriteOffService;
    }

    @GetMapping("/notes")
    public List<NoteAboutNumberTools> getAllNotes(){
      return   noteService.getAllNotes();
    }


    @GetMapping("/transactions")
    public List<Transaction> getAllTransactions(){
        return transactionService.getAllTransactions();
    }

    @GetMapping("/receiptAndWrite-Off")
    public List<ReceiptAndWriteOff> getAllInformation(){
       return receiptAndWriteOffService.getAllInformation();
    }
}
