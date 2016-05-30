package net.spring.eboutique.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import net.spring.eboutique.enites.Categorie;
import net.spring.eboutique.enites.Produit;

@Repository
public class BoutiqueDaoImp implements IBoutiqueDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Long ajouterCategorie(Categorie c) {
		em.persist(c);
		return c.getIdCategorie();
	}

	@Override
	public List<Categorie> listCategories() {
		Query rqs = em.createQuery("From Categorie c");
		return rqs.getResultList();
	}

	@Override
	public Categorie getCategorie(Long idCat) {
		
		return em.find(Categorie.class, idCat);
	}

	@Override
	public void supprimerCategorie(Long idCat) {
		Categorie c = em.find(Categorie.class, idCat);
		em.remove(c);
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		 em.merge(c);
	}

	@Override
	public Long ajouterProduit(Produit p, Long idCat) {
		Categorie c = getCategorie(idCat);
		p.setCategorie(c);
		em.persist(p);
		return p.getIdProduit();
	}

	@Override
	public List<Produit> listProduits() {
		Query rqs = em.createQuery("From Produit p");
		return rqs.getResultList();
	}

	@Override
	public List<Produit> ProduitsParCategorie(Long idCat) {
		Query rqs = em.createQuery("From Produit p where p.Categorie.idCategorie =:x");
		rqs.setParameter("x", idCat);
		return rqs.getResultList();
	}

	@Override
	public List<Produit> ProduitsSelectionnes() {
		Query rqs = em.createQuery("From Produit p where p.selected =true");
		return rqs.getResultList();
	}

	@Override
	public Produit getProduit(Long idProd) {
		return em.find(Produit.class, idProd);
	}

	@Override
	public void supprimerProduit(Long idProd) {
		Produit p = em.find(Produit.class, idProd);
		em.remove(p);
	}

	@Override
	public void modifierProduit(Produit p) {
		em.merge(p);
		
	}

}
