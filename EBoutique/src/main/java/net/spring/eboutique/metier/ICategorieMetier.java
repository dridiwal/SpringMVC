package net.spring.eboutique.metier;

import net.spring.eboutique.enites.Categorie;

public interface ICategorieMetier extends IProduitMetier {
	
	public Long ajouterCategorie(Categorie c);
	public void supprimerCategorie(Long idCat);
	public void modifierCategorie(Categorie c);

}
