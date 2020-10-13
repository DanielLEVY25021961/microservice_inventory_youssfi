package levy.daniel.application.model.persistence.metier.product.dao.jpaspring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import levy.daniel.application.model.persistence.metier.product.entities.jpa.Product;

/**
 * INTERFACE ProductDAO :<br/>
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
@RepositoryRestResource
public interface ProductDAO extends JpaRepository<Product, Long> {
	
	

} // FIN DE L'INTERFACE ProductDAO.------------------------------------------
