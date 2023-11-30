package prueba.zara.project.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
@lombok.Setter
@lombok.Getter
public class ZaraPricesPK {

	@Column(name = "BRAND_ID")
	private Long brandId;

	@Column(name = "PRODUCT_ID")
	private Long productId;

	@Column(name = "PRICE_LIST")
	private Long idTarifaAplicable;

}
