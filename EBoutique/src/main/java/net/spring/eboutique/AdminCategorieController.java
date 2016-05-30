package net.spring.eboutique;



import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import net.spring.eboutique.enites.Categorie;
import net.spring.eboutique.metier.ICategorieMetier;

@Controller
public class AdminCategorieController {
	
	@Autowired
	private ICategorieMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("categorie", new Categorie());
		model.addAttribute("categories", metier.listCategories());
		return "categories";
		
	}
	@RequestMapping(value="/savecat")
	public String saveCat(@Valid Categorie c, Model model, BindingResult bindingResult, 
			MultipartFile file) throws IOException {
		if(bindingResult.hasErrors()){
			model.addAttribute("categories", metier.listCategories());
			return "categories";
		}
		if(!file.isEmpty()){
		BufferedImage bi= ImageIO.read(file.getInputStream());	
		c.setPhoto(file.getBytes());
		c.setNomPhoto(file.getOriginalFilename());
		}
		metier.ajouterCategorie(c);
		model.addAttribute("categorie", new Categorie());
		model.addAttribute("categories", metier.listCategories());
		return "categories";
		
	}
	
}
