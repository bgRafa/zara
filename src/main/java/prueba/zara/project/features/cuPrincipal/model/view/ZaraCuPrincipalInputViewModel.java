package prueba.zara.project.features.cuPrincipal.model.view;

import java.util.Date;

import prueba.zara.common.interfaces.model.view.ZaraInputViewModel;

@lombok.Getter
@lombok.Setter
public class ZaraCuPrincipalInputViewModel implements ZaraInputViewModel {

	private static final long serialVersionUID = 5147556506982154538L;

	private Date fechaAplicacion;
	private Long identificadorProducto;
	private Long identificadorCadena;

}
