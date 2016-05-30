package net.spring.eboutique.dao;

import java.util.List;

import net.spring.eboutique.enites.*;

public interface IBoutiqueDao {

	
	public Long ajouterCategorie(Categorie c);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);
	
	public Long ajouterProduit(Produit p ,Long idCat);
	public List<Produit> listProduits();
	public List<Produit> ProduitsParCategorie(Long idCat);
	public List<Produit> ProduitsSelectionnes();
	public Produit getProduit(Long idProd);
	public void supprimerProduit(Long idProd);
	public void modifierProduit(Produit p);
}
