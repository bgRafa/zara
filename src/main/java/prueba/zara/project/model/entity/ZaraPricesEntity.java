package prueba.zara.project.model.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRICES")
@lombok.Setter
@lombok.Getter
public class ZaraPricesEntity {

	@EmbeddedId
	private ZaraPricesPK id;

	@Column(name = "START_DATE")
	private Date fechaInicio;

	@Column(name = "END_DATE")
	private Date fechaFin;

	@Column(name = "PRIORITY")
	private Long priority;

	@Column(name = "PRICE")
	private BigDecimal precio;

	@Column(name = "CURR")
	private String tipoMoneda;

}
