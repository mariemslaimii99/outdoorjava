/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entités;

/**
 *
 * @author maryem
 */
public class Produit {
    private int id  ,categorie_id,stock;
    private String nom_p ,description,image,prix ;

    public Produit(int id, String prix, int categorie_id, int stock, String nom_p, String description, String image) {
        this.id = id;
        this.prix = prix;
        this.categorie_id = categorie_id;
        this.stock = stock;
        this.nom_p = nom_p;
        this.description = description;
        this.image = image;
    }

    public Produit() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public String getPrix() {
        return prix;
    }

    public int getCategorie_id() {
        return categorie_id;
    }

    public int getStock() {
        return stock;
    }

    public String getNom_p() {
        return nom_p;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public void setCategorie_id(int categorie_id) {
        this.categorie_id = categorie_id;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setNom_p(String nom_p) {
        this.nom_p = nom_p;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", prix=" + prix + ", categorie_id=" + categorie_id + ", stock=" + stock + ", nom_p=" + nom_p + ", description=" + description + ", image=" + image + '}';
    }
    
    
    
    
}
