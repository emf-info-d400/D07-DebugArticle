package app;

import models.Categorie;
import models.Article;

public class Application {
    public static void main(String[] args) {

        // Création des catégories
        Categorie c1 = new Categorie("Ordinateurs");
        Categorie c2 = new Categorie("Smartphones");
        Categorie c3 = new Categorie("Tablettes");
        Categorie c4 = new Categorie("Imprimantes");
        Categorie c5 = new Categorie("Ecrans");

        // Création des articles
        Article[] tabArticles = new Article[11];
        tabArticles[0] = new Article("HP EliteBook 840 G3", 1200, c1);
        tabArticles[1] = new Article("HP EliteBook 840 G4", 1300, c1);
        tabArticles[2] = new Article("Google Pixel 4a 4G", 699, c2);
        tabArticles[3] = new Article("Google Pixel 4a 5G", 799, c2);
        tabArticles[4] = new Article("Google Pixel 5 5G", 899, c2);
        tabArticles[5] = new Article("Apple iPad Pro 11", 899, c3);
        tabArticles[6] = new Article("Apple iPad Pro 12.9", 1099, c3);
        tabArticles[7] = new Article("HP LaserJet Pro M15w", 99, c4);
        tabArticles[8] = new Article("HP LaserJet Pro M28w", 149, c4);
        tabArticles[9] = new Article("HP 24fw FullScreen", 149, c5);
        tabArticles[10] = new Article("HP 27fw FullScreen", 199, c5);

        // Affichage des articles
        System.out.println("Liste des articles avec le détail des prix:");
        for (int i = 0; i < tabArticles.length; i++) {
            System.out.println(tabArticles[i]);
        }

        System.out.println("----------------------------------------------");

        // Ajout d'un article
        Article a1 = new Article("HP EliteBook 840 G5", 1400, c1);
        tabArticles[11] = a1;

        // Suppression d'un article
        tabArticles[10] = null;

        // Affichage des articles
        System.out.println("Liste des articles avec uniquement la désignation:");
        for (int i = 0; i < tabArticles.length; i++) {
            System.out.println(tabArticles[i].getDesignation());
        }

        System.out.println("----------------------------------------------");

        // Affichage des articles de la catégorie Ordinateurs
        System.out.println("Liste des articles de la catégorie Ordinateurs:");
        for (int i = 0; i < tabArticles.length; i++) {
            if (tabArticles[i] != null) {
                if (tabArticles[i].getCategorie().getLibelle().equals("Ordinateurs")) {
                    System.out.println(tabArticles[i]);
                }
            }
        }

        System.out.println("----------------------------------------------");

    }
}
