package fr.orsys.ecomapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.orsys.ecomapp.dao.ProductRepository;
import fr.orsys.ecomapp.entities.Product;

@SpringBootApplication
public class EcomAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomAppApplication.class, args);
	}
	@Bean
	CommandLineRunner start (ProductRepository productRepository) {
		return args->{
			productRepository.save(new Product(null,"ord HP 456",8000));
			productRepository.save(new Product(null,"Imprimante LX 11",100));
			productRepository.save(new Product(null,"Smart Phone Samsung S10",9900));
			productRepository.findAll().forEach(p->{
				System.out.println(p.getName());
			});
		};
	}

}
