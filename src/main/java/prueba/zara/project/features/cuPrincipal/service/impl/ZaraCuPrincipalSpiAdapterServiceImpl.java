package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.dao.ZaraPrices;
import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalSpiAdapterService;
import prueba.zara.project.model.domain.ZaraPricesDomainModel;

@Service
public class ZaraCuPrincipalSpiAdapterServiceImpl implements ZaraCuPrincipalSpiAdapterService {

	@Autowired
	private ZaraPrices iZaraPrices;

	@Override
	public ZaraPricesDomainModel get(ZaraCuPrincipalCriteriaDomainModel cdm) {

		var cuPrincipal = cdm.getCuPrincipal();
		var fechaAplicacion = cuPrincipal.getFechaAplicacion();
		var identificadorProducto = cuPrincipal.getIdentificadorProducto();
		var identificadorCadena = cuPrincipal.getIdentificadorCadena();

		var listadoPrices = iZaraPrices.getPricesByCriterios(fechaAplicacion, fechaAplicacion, identificadorProducto,
				identificadorCadena);

		var result = listadoPrices.stream().findFirst().orElse(null);

		var domain = new ZaraPricesDomainModel();
		domain.setBrandId(result.getId().getBrandId());
		domain.setFechaFin(result.getFechaFin());
		domain.setFechaInicio(result.getFechaFin());
		domain.setIdTarifaAplicable(result.getId().getIdTarifaAplicable());
		domain.setPrecio(result.getPrecio());
		domain.setPriority(result.getPriority());
		domain.setProductId(result.getId().getProductId());
		domain.setTipoMoneda(result.getTipoMoneda());
		return domain;
	}

}
