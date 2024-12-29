package com.projet.docker.controller;


import com.projet.docker.entity.Etudiant;
import com.projet.docker.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/etudiants")
public class EtudiantController {
    @Autowired
    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @PostMapping
    public ResponseEntity<Etudiant> createEtudiant(@RequestBody Etudiant etudiant) {
        return ResponseEntity.ok(etudiantService.createEtudiant(etudiant.getNom()));
    }

    @GetMapping
    public ResponseEntity<List<Etudiant>> getAllEtudiants() {
        return ResponseEntity.ok(etudiantService.getAllEtudiants());
    }

    // Nouvelle méthode pour récupérer un étudiant par son ID
    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable Long id) {
        Optional<Etudiant> etudiant = etudiantService.getEtudiantById(id);

        if (etudiant.isPresent()) {
            return ResponseEntity.ok(etudiant.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
