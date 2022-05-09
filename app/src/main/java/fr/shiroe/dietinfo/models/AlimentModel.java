package fr.shiroe.dietinfo.models;

public class AlimentModel {

    int id;
    String nom;
    double glucide;
    double lipide;
    double proteine;
    double fibre;
    double eau;
    double energie;

    public AlimentModel(int id, String nom, double glucide, double lipide, double proteine, double fibre, double eau, double energie){
        this.id = id;
        this.nom = nom;
        this.glucide = glucide;
        this.lipide = lipide;
        this.proteine = proteine;
        this.fibre = fibre;
        this.eau = eau;
        this.energie = energie;
    }
}
