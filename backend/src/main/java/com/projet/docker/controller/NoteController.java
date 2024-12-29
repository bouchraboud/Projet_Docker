package com.projet.docker.controller;


import com.projet.docker.entity.Note;
import com.projet.docker.service.NoteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiants/{id}/notes")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public ResponseEntity<List<Note>> getNotesByEtudiant(@PathVariable Long id) {
        return ResponseEntity.ok(noteService.getNotesByEtudiant(id));
    }

    @PostMapping
    public ResponseEntity<Note> addNoteToEtudiant(@RequestBody  Note note,@PathVariable Long id) {
        return ResponseEntity.ok(noteService.addNoteToEtudiant(id,note.getNomDuCours(),note.getValeurDeNote()));
    }
}
