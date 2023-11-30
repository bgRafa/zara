package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.dao.ZaraPrices;
import prueba.zara.project.features.cuPrincipal.mapper.ZaraCuPrincipalMapper;
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

		return ZaraCuPrincipalMapper.INSTANCE.toDomain(result);
	}

}
