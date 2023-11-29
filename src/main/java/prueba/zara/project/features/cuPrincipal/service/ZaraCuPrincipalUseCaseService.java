package prueba.zara.project.features.cuPrincipal.service;

import prueba.zara.common.interfaces.service.ZaraUseCaseService;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;

public interface ZaraCuPrincipalUseCaseService extends ZaraUseCaseService {

	ZaraCuPrincipalViewModel obtePrices(ZaraCuPrincipalInputViewModel input);

}
