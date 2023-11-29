package prueba.zara.common.interfaces.service;

import prueba.zara.common.interfaces.model.domain.ZaraCriteriaDomainModel;

public interface ZaraApiPortService<C extends ZaraCriteriaDomainModel> {

	void check(C cdm);
}
