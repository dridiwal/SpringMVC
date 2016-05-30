package net.spring.eboutique.enites;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Produit implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idProduit;
	private String designation;
	private String description;
	private double prix;
	private boolean selected;
	private String photo;
	private int quantite;
	@ManyToOne
	@JoinColumn(name="ID_CAT")
	private Categorie categorie;
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String designation, String description, double prix, boolean selected, String photo, int quantite) {
		super();
		this.designation = designation;
		this.description = description;
		this.prix = prix;
		this.selected = selected;
		this.photo = photo;
		this.quantite = quantite;
	}
	
	
}
