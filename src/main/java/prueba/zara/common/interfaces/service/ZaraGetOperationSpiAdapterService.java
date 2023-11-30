package prueba.zara.common.interfaces.service;

import prueba.zara.common.interfaces.model.domain.ZaraCriteriaDomainModel;
import prueba.zara.common.interfaces.model.domain.ZaraDomainModel;

public interface ZaraGetOperationSpiAdapterService<C extends ZaraCriteriaDomainModel, L extends ZaraDomainModel>
		extends ZaraSpiAdapterService {

	L get(C cdm);
}
