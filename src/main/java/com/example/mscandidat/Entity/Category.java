package com.example.mscandidat.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;



@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class , property = "idFoyer")
@Table(name="Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom , type ,description ;

    public Category() {
    }

    public Category(String nom, String type, String description) {
        this.nom = nom;
        this.type = type;
        this.description = description;
    }

    public Category(int id, String nom, String type, String description) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}





