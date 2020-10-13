package levy.daniel.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import levy.daniel.application.model.persistence.metier.product.dao.jpaspring.ProductDAO;
import levy.daniel.application.model.persistence.metier.product.entities.jpa.Product;

/**
 * CLASSE MicroServiceInventoryYoussfiBackendApplication :<br/>
 * .<br/>
 * <br/>
 *
 * - Exemple d'utilisation :<br/>
 *<br/>
 * 
 * - Mots-clé :<br/>
 * <br/>
 *
 * - Dépendances :<br/>
 * <br/>
 *
 *
 * @author Daniel Lévy
 * @version 1.0
 * @since 4 oct. 2020
 */
@SpringBootApplication
public class MicroServiceInventoryYoussfiBackendApplication { // NOPMD by dan on 04/10/2020 15:21

	
	
	/**
	 * Point d'entrée de l'application (Micro-Service).
	 * 
	 * @param pArgs : String[] : paramètres de lancement du Micro-Service.
	 */
	public static void main(final String... pArgs) {
		
		SpringApplication
			.run(MicroServiceInventoryYoussfiBackendApplication.class, pArgs);
		
	} // Fin de main(...)._________________________________________________
	
	
	
	/**
	 * méthode appliquée au démarrage du Micro-Service.
	 * 
	 * @param pProductDAO : ProductDAO.
	 * 
	 * @return CommandLineRunner.
	 */
	@Bean
	public CommandLineRunner start(final ProductDAO pProductDAO) {
		
		return args -> {
			
			final Product product1 = new Product(null, "code1", "name1", 1000D);
			final Product product2 = new Product(null, "code2", "name2", 2000D);
			final Product product3 = new Product(null, "code3", "name3", 3000D);
			final Product product4 = new Product(null, "code4", "name4", 4000D);
			
			pProductDAO.save(product1);
			pProductDAO.save(product2);
			pProductDAO.save(product3);
			pProductDAO.save(product4);
			
			pProductDAO.findAll().forEach(System.out::println);
			
		};
		
	} // Fin de start(...).________________________________________________

	
	
} // FIN DE LA CLASSE MicroServiceInventoryYoussfiBackendApplication.--------
