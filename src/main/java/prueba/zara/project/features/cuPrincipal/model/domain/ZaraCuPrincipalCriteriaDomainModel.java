package prueba.zara.project.features.cuPrincipal.model.domain;

import prueba.zara.common.interfaces.model.domain.ZaraCriteriaDomainModel;
import prueba.zara.project.model.domain.ZaraPricesDomainModel;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalCriteriaDomainModel implements ZaraCriteriaDomainModel {

	private static final long serialVersionUID = 1L;
	ZaraCuPrincipalDomainModel cuPrincipal = new ZaraCuPrincipalDomainModel();

	// salida
	ZaraPricesDomainModel pricesDomainModel;

}
