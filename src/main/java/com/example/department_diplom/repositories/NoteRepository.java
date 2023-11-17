package com.example.department_diplom.repositories;

import com.example.department_diplom.models.NoteAboutNumberTools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteAboutNumberTools,Long> {
}
