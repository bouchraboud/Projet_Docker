package com.projet.docker.service;


import com.projet.docker.entity.Note;
import com.projet.docker.repository.NoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getNotesByEtudiant(Long idEtudiant) {
        return noteRepository.findByIdEtudiant(idEtudiant);
    }

    public Note addNoteToEtudiant(Long idEtudiant, String nomDuCours, Double valeurDeNote) {
        Note note = new Note();
        note.setIdEtudiant(idEtudiant);
        note.setNomDuCours(nomDuCours);
        note.setValeurDeNote(valeurDeNote);
        return noteRepository.save(note);
    }
}

