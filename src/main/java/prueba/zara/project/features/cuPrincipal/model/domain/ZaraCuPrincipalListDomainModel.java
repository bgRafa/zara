package prueba.zara.project.features.cuPrincipal.model.domain;

import java.util.List;

import prueba.zara.common.interfaces.model.domain.ZaraAbstractListDomainModel;

public class ZaraCuPrincipalListDomainModel extends ZaraAbstractListDomainModel<ZaraCuPrincipalDomainModel> {

	private static final long serialVersionUID = 1L;

	public ZaraCuPrincipalListDomainModel() {
		super();
	}

	public ZaraCuPrincipalListDomainModel(List<ZaraCuPrincipalDomainModel> list) {
		super(list);
	}

}
