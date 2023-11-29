package prueba.zara.common.interfaces.model.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.CollectionUtils;

public abstract class ZaraAbstractListDomainModel<A extends ZaraDomainModel> implements ZaraListDomainModel<A> {

	private static final long serialVersionUID = 4322587839932526307L;

	private List<A> list = new ArrayList<>();

	protected ZaraAbstractListDomainModel() {

		list = new ArrayList<>();
	}

	protected ZaraAbstractListDomainModel(List<A> list) {
		this();
		this.setList(list);
	}

	@Override
	public List<A> getList() {
		return list;
	}

	@Override
	public void setList(List<A> list) {
		this.list.clear();
		if (!CollectionUtils.isEmpty(list)) {
			this.list.addAll(list);
		}
	}
}
