package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalApiAdapterService;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalUseCaseService;

@Service
public class ZaraCuPrincipalUseCaseServiceImpl implements ZaraCuPrincipalUseCaseService {

	@Autowired
	ZaraCuPrincipalApiAdapterService apiAdapterService;

	@Override
	public ZaraCuPrincipalViewModel obtePrices(ZaraCuPrincipalInputViewModel input) {

		var cdm = apiAdapterService.toDomain(input);
		return apiAdapterService.toView(cdm);
	}

}
