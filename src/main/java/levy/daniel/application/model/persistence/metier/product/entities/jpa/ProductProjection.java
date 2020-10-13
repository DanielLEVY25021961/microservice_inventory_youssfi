package levy.daniel.application.model.persistence.metier.product.entities.jpa;

import org.springframework.data.rest.core.config.Projection;

/**
 * INTERFACE ProductProjection :<br/>
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
 * @since 6 oct. 2020
 */
@Projection(name = "fullProductProjection", types = Product.class)
public interface ProductProjection {

	
	
	/**
	 * @return ID en base du Product : Long.
	 */
	Long getId();

	
	
	/**
	 * @return le code du Product : String.
	 */
	String getCode();

	
	
	/**
	 * @return le name du Product : String.
	 */
	String getName();

	
	
	/**
	 * @return le Price du Product : Double.
	 */
	Double getPrice();

	
	
} // FIN DE L'INTERFACE ProductProjection.-----------------------------------
