package prueba.zara.project.features.cuPrincipal.model.view;

import java.math.BigDecimal;
import java.util.Date;

import prueba.zara.common.interfaces.model.view.ZaraViewModel;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalViewModel implements ZaraViewModel {

	private static final long serialVersionUID = 5147556506982154538L;

	private Long brandId;
	private Long productId;
	private Long idTarifaAplicable;
	private Date fechaInicio;
	private Date fechaFin;
	private BigDecimal precio;

}
