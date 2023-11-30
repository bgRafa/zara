package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.features.cuPrincipal.mapper.ZaraCuPrincipalMapper;
import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
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
		var domain = ZaraCuPrincipalMapper.INSTANCE.toDomain(input);
		cdm.setCuPrincipal(domain);
		return cdm;
	}

	@Override
	public ZaraCuPrincipalViewModel toView(ZaraCuPrincipalCriteriaDomainModel cdm) {
		var cuPrincipal = cdm.getCuPrincipal();
		var domain = cuPrincipal.getPricesDomainModel();
		return ZaraCuPrincipalMapper.INSTANCE.toView(domain);
	}
}
