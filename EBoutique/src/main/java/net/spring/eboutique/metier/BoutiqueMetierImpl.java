package net.spring.eboutique.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import net.spring.eboutique.dao.IBoutiqueDao;
import net.spring.eboutique.enites.Categorie;
import net.spring.eboutique.enites.Produit;

@Transactional
public class BoutiqueMetierImpl implements ICategorieMetier  {

	private IBoutiqueDao dao;

	
	public IBoutiqueDao getDao() {
		return dao;
	}

	public void setDao(IBoutiqueDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Produit> listProduits() {
		// TODO Auto-generated method stub
		return dao.listProduits();
	}

	@Override
	public List<Produit> ProduitsParCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.ProduitsParCategorie(idCat);
	}

	@Override
	public List<Produit> ProduitsSelectionnes() {
		// TODO Auto-generated method stub
		return dao.ProduitsSelectionnes();
	}

	@Override
	public Produit getProduit(Long idProd) {
		// TODO Auto-generated method stub
		return dao.getProduit(idProd);
	}

	@Override
	public List<Categorie> listCategories() {
		// TODO Auto-generated method stub
		return dao.listCategories();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		// TODO Auto-generated method stub
		return dao.getCategorie(idCat);
	}

	@Override
	public Long ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		return dao.ajouterCategorie(c);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		// TODO Auto-generated method stub
		dao.supprimerCategorie(idCat);
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		dao.modifierCategorie(c);
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		// TODO Auto-generated method stub
		return dao.ajouterProduit(p, idCat);
	}

	@Override
	public void supprimerProduit(Long idProd) {
		// TODO Auto-generated method stub
		dao.supprimerProduit(idProd);
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		dao.modifierProduit(p);
	}

}
