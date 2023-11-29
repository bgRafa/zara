package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.stereotype.Service;

import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalApiAdapterService;

@Service
public class ZaraCuPrincipalApiAdapterServiceImpl implements ZaraCuPrincipalApiAdapterService {

	@Override
	public ZaraCuPrincipalCriteriaDomainModel check(ZaraCuPrincipalInputViewModel input) {

		return null;
	}

	@Override
	public ZaraCuPrincipalCriteriaDomainModel toDomain(ZaraCuPrincipalInputViewModel input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ZaraCuPrincipalViewModel toView(ZaraCuPrincipalCriteriaDomainModel cdm) {
		// TODO Auto-generated method stub
		return null;
	}
}
