package models;

public class Article {

    public final static String SEPARATOR = "\t";
    public final static String FORMAT_PRIX = "##,##0.00 CHF";

    private String designation;
    private double prix;
    private Categorie categorie;

    public Article(String designation, double prix, Categorie categorie) {
        this.designation = designation;
        this.prix = prix;
        categorie = categorie;
    }

    public String getDesignation() {
        return designation;
    }

    public Categorie getCategorie() {
        return categorie;
    }

}
