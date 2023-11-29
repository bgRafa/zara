package prueba.zara.common.interfaces.service;

import prueba.zara.common.interfaces.model.domain.ZaraCriteriaDomainModel;
import prueba.zara.common.interfaces.model.view.ZaraInputViewModel;
import prueba.zara.common.interfaces.model.view.ZaraViewModel;

public interface ZaraApiAdapterService<I extends ZaraInputViewModel, C extends ZaraCriteriaDomainModel, V extends ZaraViewModel> {

	C toDomain(I input);

	C check(I input);

	V toView(C cdm);
}
