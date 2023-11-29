package prueba.zara.CU_Principal.domain.view;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalViewModel implements Serializable {

	private static final long serialVersionUID = 5147556506982154538L;

	private Date fechaAplicacionIni;
	private Date fechaAplicacionFin;
	private Long identificadorProducto;
	private Long identificadorCadena;

	private BigDecimal precioFinal;
	private Long tarifaAplicar;
}
