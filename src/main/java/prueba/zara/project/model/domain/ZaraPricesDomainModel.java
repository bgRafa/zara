package prueba.zara.project.model.domain;

import java.math.BigDecimal;
import java.util.Date;

import prueba.zara.common.interfaces.model.domain.ZaraDomainModel;

@lombok.Setter
@lombok.Getter
public class ZaraPricesDomainModel implements ZaraDomainModel {

	private static final long serialVersionUID = 1L;
	private Long brandId;
	private Long productId;
	private Long idTarifaAplicable;
	private Date fechaInicio;
	private Date fechaFin;
	private Long priority;
	private BigDecimal precio;
	private String tipoMoneda;

}
