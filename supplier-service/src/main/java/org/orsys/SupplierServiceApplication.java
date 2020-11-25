package org.orsys;

import org.orsys.dao.SupplierRepository;
import org.orsys.entities.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class SupplierServiceApplication implements CommandLineRunner {
  @Autowired 
  private SupplierRepository supplierRepository;
  @Autowired 
  RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(SupplierServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Supplier.class);
		supplierRepository.save(new Supplier(null,"IBM","ibm.gmail.com"));
		supplierRepository.save(new Supplier(null,"HP","hp.gmail.com"));
		supplierRepository.save(new Supplier(null,"Samsung","samsung.gmail.com"));
		supplierRepository.findAll().forEach(s->{
			System.out.println("Nom:"+s.getName());
		});
	}

}
