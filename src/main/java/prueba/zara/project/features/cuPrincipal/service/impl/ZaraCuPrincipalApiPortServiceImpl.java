package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalApiPortService;

@Service
public class ZaraCuPrincipalApiPortServiceImpl implements ZaraCuPrincipalApiPortService {

	@Override
	public void check(ZaraCuPrincipalCriteriaDomainModel cdm) {
		var cuPrincipal = cdm.getCuPrincipal();
		var fechaAplicacion = cuPrincipal.getFechaAplicacion();
		var identificadorProducto = cuPrincipal.getIdentificadorProducto();
		var identificadorCadena = cuPrincipal.getIdentificadorCadena();

		if (ObjectUtils.isEmpty(fechaAplicacion)) {
			new Exception("Fecha aplicación no puede ser null");
		}
		if (ObjectUtils.isEmpty(identificadorProducto)) {
			new Exception("Identificador producto no puede ser null");
		}
		if (ObjectUtils.isEmpty(identificadorCadena)) {
			new Exception("Identificador cadena no peude ser null");
		}

	}

}
