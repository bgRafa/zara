package prueba.zara.project.features.cuPrincipal.model.view;

import java.math.BigDecimal;
import java.util.Date;

import prueba.zara.common.interfaces.model.view.ZaraViewModel;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalViewModel implements ZaraViewModel {

	private static final long serialVersionUID = 5147556506982154538L;

	private Date fechaAplicacionIni;
	private Date fechaAplicacionFin;
	private Long identificadorProducto;
	private Long identificadorCadena;

	private BigDecimal precioFinal;
	private Long tarifaAplicar;
}
