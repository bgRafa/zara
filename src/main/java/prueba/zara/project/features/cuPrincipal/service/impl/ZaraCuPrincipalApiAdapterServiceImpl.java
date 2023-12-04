package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalDomainModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalApiAdapterService;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalApiPortService;

@Service
public class ZaraCuPrincipalApiAdapterServiceImpl implements ZaraCuPrincipalApiAdapterService {

	@Autowired
	ZaraCuPrincipalApiPortService apiPortService;

	@Override
	public ZaraCuPrincipalCriteriaDomainModel toDomain(ZaraCuPrincipalInputViewModel input) {
		var cdm = check(input);
		apiPortService.check(cdm);
		return cdm;
	}

	@Override
	public ZaraCuPrincipalCriteriaDomainModel check(ZaraCuPrincipalInputViewModel input) {
		var cdm = new ZaraCuPrincipalCriteriaDomainModel();

		var domain = new ZaraCuPrincipalDomainModel();
		domain.setFechaAplicacion(input.getFechaAplicacion());
		domain.setIdentificadorCadena(input.getIdentificadorCadena());
		domain.setIdentificadorProducto(input.getIdentificadorProducto());
		cdm.setCuPrincipal(domain);
		return cdm;
	}

	@Override
	public ZaraCuPrincipalViewModel toView(ZaraCuPrincipalCriteriaDomainModel cdm) {
		var domain = cdm.getPricesDomainModel();
		var view = new ZaraCuPrincipalViewModel();
		view.setBrandId(domain.getBrandId());
		view.setIdTarifaAplicable(domain.getIdTarifaAplicable());
		view.setFechaInicio(domain.getFechaInicio());
		view.setFechaFin(domain.getFechaFin());
		view.setPrecio(domain.getPrecio());
		view.setProductId(domain.getProductId());

		return view;
	}
}
