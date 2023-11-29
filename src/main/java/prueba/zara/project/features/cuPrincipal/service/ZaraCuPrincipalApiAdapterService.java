package prueba.zara.project.features.cuPrincipal.service;

import prueba.zara.common.interfaces.service.ZaraApiAdapterService;
import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalCriteriaDomainModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;

public interface ZaraCuPrincipalApiAdapterService extends
		ZaraApiAdapterService<ZaraCuPrincipalInputViewModel, ZaraCuPrincipalCriteriaDomainModel, ZaraCuPrincipalViewModel> {

}
