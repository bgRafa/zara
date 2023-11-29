package prueba.zara.common.interfaces.controller;

import org.springframework.http.ResponseEntity;

import prueba.zara.common.interfaces.model.view.ZaraViewModel;

public abstract class ZaraAbstractController {

	public <T extends ZaraViewModel> ResponseEntity<T> ok(T body) {
		return ResponseEntity.ok().body(body);
	}
}
