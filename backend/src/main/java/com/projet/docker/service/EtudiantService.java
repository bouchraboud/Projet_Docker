package com.projet.docker.service;


import com.projet.docker.entity.Etudiant;
import com.projet.docker.entity.Note;
import com.projet.docker.repository.EtudiantRepository;
import com.projet.docker.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EtudiantService {
    private final EtudiantRepository etudiantRepository;
    private final NoteRepository noteRepository;
    public EtudiantService(EtudiantRepository etudiantRepository, NoteRepository noteRepository) {
        this.etudiantRepository = etudiantRepository;
        this.noteRepository = noteRepository;
    }

    public Etudiant createEtudiant(String nom) {
        Etudiant etudiant = new Etudiant();
        etudiant.setNom(nom);
        return etudiantRepository.save(etudiant);
    }

    // Obtenir tous les étudiants avec leur moyenne calculée
    public List<Etudiant> getAllEtudiants() {
        List<Etudiant> etudiants = etudiantRepository.findAll();

        for (Etudiant etudiant : etudiants) {
            List<Note> notes = noteRepository.findByIdEtudiant(etudiant.getId());
            double sommeNotes = 0;
            int nombreDeNotes = notes.size();

            for (Note note : notes) {
                sommeNotes += note.getValeurDeNote();
            }

            double moyenne = nombreDeNotes > 0 ? sommeNotes / nombreDeNotes : 0;
            etudiant.setMoyenne(moyenne);
        }

        return etudiants;
    }

    public Optional<Etudiant> getEtudiantById(Long id) {
        return etudiantRepository.findById(id); // Utilise la méthode findById du repository
    }

}

