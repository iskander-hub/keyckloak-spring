package fr.orsys.ecomapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.orsys.ecomapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
