package prueba.zara.common.interfaces.service;

import prueba.zara.common.interfaces.model.domain.ZaraCriteriaDomainModel;

public interface ZaraSpiPortService<C extends ZaraCriteriaDomainModel> {

	void process(C cdm);

}
