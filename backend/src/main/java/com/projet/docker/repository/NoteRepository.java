package com.projet.docker.repository;

import com.projet.docker.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByIdEtudiant(Long idEtudiant);


}