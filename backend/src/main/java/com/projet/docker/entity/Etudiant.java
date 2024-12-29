package com.projet.docker.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "ETUDIANTS")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(name = "date_de_creation", nullable = false)
    private LocalDate dateDeCreation = LocalDate.now();

    @Transient  // Ne sera pas stockée dans la base de données
    private Double moyenne;

    // Getter et Setter pour 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour 'nom'
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter et Setter pour 'dateDeCreation'
    public LocalDate getDateDeCreation() {
        return dateDeCreation;
    }

    public void setDateDeCreation(LocalDate dateDeCreation) {
        this.dateDeCreation = dateDeCreation;
    }

    // Getter et Setter pour 'moyenne'
    public Double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(Double moyenne) {
        this.moyenne = moyenne;
    }
}
