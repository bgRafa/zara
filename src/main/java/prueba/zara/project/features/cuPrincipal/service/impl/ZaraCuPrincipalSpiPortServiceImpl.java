package prueba.zara.project.features.cuPrincipal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalSpiAdapterService;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalSpiPortService;

@Service
public class ZaraCuPrincipalSpiPortServiceImpl implements ZaraCuPrincipalSpiPortService {

	@Autowired
	ZaraCuPrincipalSpiAdapterService spiAdapterService;

	@Override
	public void process(ZaraCuPrincipalCriteriaDomainModel cdm) {
		var domain = spiAdapterService.get(cdm);
		var cuPrincipal = cdm.getCuPrincipal();
		cuPrincipal.setPricesDomainModel(domain);
	}
}
