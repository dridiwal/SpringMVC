package net.spring.eboutique.metier;

import net.spring.eboutique.enites.Produit;

public interface IProduitMetier extends IInternauteMetier  {
	
	public Long ajouterProduit(Produit p ,Long idCat);
	public void supprimerProduit(Long idProd);
	public void modifierProduit(Produit p);

}
