package fr.orsys.ecomapp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.orsys.ecomapp.dao.ProductRepository;

@Controller
public class ProductController {
@Autowired
private ProductRepository productRepository;
   @GetMapping("/")
   public String index() {
	   
	   return "index";
   }
   @GetMapping("/products")
   public String index(Model model) {
	   model.addAttribute("products", productRepository.findAll());
	   return "products";
   }
}
