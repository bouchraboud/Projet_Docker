package com.projet.docker.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "NOTES")
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_etudiant", nullable = false)
    private Long idEtudiant;

    @Column(name = "nom_du_cours", nullable = false)
    private String nomDuCours;

    @Column(name = "valeur_de_note", nullable = false)
    private Double valeurDeNote;

    // Getter et Setter pour 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter et Setter pour 'idEtudiant'
    public Long getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(Long idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    // Getter et Setter pour 'nomDuCours'
    public String getNomDuCours() {
        return nomDuCours;
    }

    public void setNomDuCours(String nomDuCours) {
        this.nomDuCours = nomDuCours;
    }

    // Getter et Setter pour 'valeurDeNote'
    public Double getValeurDeNote() {
        return valeurDeNote;
    }

    public void setValeurDeNote(Double valeurDeNote) {
        this.valeurDeNote = valeurDeNote;
    }
}


