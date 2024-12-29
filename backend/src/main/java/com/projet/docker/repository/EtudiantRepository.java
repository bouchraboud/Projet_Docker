package com.projet.docker.repository;

import com.projet.docker.entity.Etudiant;
import com.projet.docker.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}