package net.spring.eboutique;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.spring.eboutique.enites.Produit;
import net.spring.eboutique.metier.ICategorieMetier;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@org.junit.Test
	public void test() {
		try{
			ClassPathXmlApplicationContext app= new ClassPathXmlApplicationContext
					(new String[]{"applicationContext.xml"});
			ICategorieMetier metier = (ICategorieMetier) app.getBean("metier");
			List<Produit> clst= metier.listProduits();
			metier.ajouterProduit(new Produit("acer", "Ordiportable", 2500, true, "image1.jpg",10), 20L);
			metier.ajouterProduit(new Produit("Epson", "impremente", 150, true, "image2.jpg",10), 21L);
			List<Produit> clst1= metier.listProduits();
			assertTrue(clst.size()+2==clst1.size());
		}catch(Exception e){
			assertTrue(e.getMessage(),false);
			
		}
	}

}
