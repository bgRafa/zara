package prueba.zara.project.features.cuPrincipal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.zara.common.interfaces.controller.ZaraAbstractController;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;
import prueba.zara.project.features.cuPrincipal.service.ZaraCuPrincipalUseCaseService;

@RestController
@RequestMapping("/zara")
public class ZaraCuPrincipalController extends ZaraAbstractController {

	@Autowired
	ZaraCuPrincipalUseCaseService useCaseService;

	@PostMapping(value = "/obtePrices", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ZaraCuPrincipalViewModel> obtePrices(@RequestBody ZaraCuPrincipalInputViewModel input) {
		return ok(useCaseService.obtePrices(input));
	}
}
