package net.spring.eboutique.metier;

import java.util.List;

import net.spring.eboutique.enites.Categorie;
import net.spring.eboutique.enites.Produit;

public interface IInternauteMetier {

	public List<Produit> listProduits();
	public List<Produit> ProduitsParCategorie(Long idCat);
	public List<Produit> ProduitsSelectionnes();
	public Produit getProduit(Long idProd);
	public List<Categorie> listCategories();
	public Categorie getCategorie(Long idCat);
}
