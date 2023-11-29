package prueba.zara.CU_Principal.domain.view;

import java.io.Serializable;
import java.util.Date;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalInputViewModel implements Serializable {

	private static final long serialVersionUID = 5147556506982154538L;

	private Date fechaAplicacion;
	private Long identificadorProducto;
	private Long identificadorCadena;

}
