package com.example.department_diplom.services;

import com.example.department_diplom.models.NoteAboutNumberTools;
import com.example.department_diplom.repositories.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<NoteAboutNumberTools> getAllNotes(){
        return noteRepository.findAll();
    }
}
