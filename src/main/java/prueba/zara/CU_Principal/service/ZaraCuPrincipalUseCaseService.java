package prueba.zara.CU_Principal.service;

import prueba.zara.CU_Principal.domain.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.CU_Principal.domain.view.ZaraCuPrincipalViewModel;

public interface ZaraCuPrincipalUseCaseService {

	ZaraCuPrincipalViewModel obtePrices(ZaraCuPrincipalInputViewModel input);

}
