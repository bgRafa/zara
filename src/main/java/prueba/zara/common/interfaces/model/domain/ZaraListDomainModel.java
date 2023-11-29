package prueba.zara.common.interfaces.model.domain;

import java.util.List;

public interface ZaraListDomainModel<A extends ZaraDomainModel> extends ZaraDomainModel {

	List<A> getList();

	void setList(List<A> list);
}
