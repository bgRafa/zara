package prueba.zara.project.features.cuPrincipal.model.domain;

import java.util.Date;

import prueba.zara.common.interfaces.model.domain.ZaraDomainModel;
import prueba.zara.project.model.domain.ZaraPricesDomainModel;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalDomainModel implements ZaraDomainModel {

	private static final long serialVersionUID = 1L;
	// entrada
	private Date fechaAplicacion;
	private Long identificadorProducto;
	private Long identificadorCadena;

	// salida
	ZaraPricesDomainModel pricesDomainModel;
}
