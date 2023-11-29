package prueba.zara.CU_Principal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import prueba.zara.CU_Principal.domain.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.CU_Principal.domain.view.ZaraCuPrincipalViewModel;
import prueba.zara.CU_Principal.service.ZaraCuPrincipalUseCaseService;

@RestController
@RequestMapping("/zara")
public class ZaraCuPrincipalController {

	@Autowired
	ZaraCuPrincipalUseCaseService useCaseService;

	@PostMapping("/obtePrices")
	public ResponseEntity<ZaraCuPrincipalViewModel> obtePrices(@RequestBody ZaraCuPrincipalInputViewModel input) {
		return ResponseEntity.ok(useCaseService.obtePrices(input));
	}
}
