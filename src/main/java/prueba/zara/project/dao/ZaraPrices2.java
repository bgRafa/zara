package prueba.zara.project.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import prueba.zara.project.model.entity.ZaraPricesEntity;
import prueba.zara.project.model.entity.ZaraPricesPK;

public interface ZaraPrices2 extends CrudRepository<ZaraPricesEntity, ZaraPricesPK> {

	@Query(value = "SELECT P.* FROM PRICES P where 1=1   AND P.START_DATE  <= :fechaAplicacion "
			+ " AND P.END_DATE  >= :fechaAplicacion2   AND P.BRAND_ID = :identificadorCadena "
			+ " AND P.PRODUCT_ID = :identificadorProducto   ORDER BY P.PRIORITY DESC ", nativeQuery = true)

	public List<ZaraPricesEntity> getPricesByCriterios(@Param("fechaAplicacion") Date fechaAplicacion,
			@Param("fechaAplicacion2") Date fechaAplicacion2,
			@Param("identificadorProducto") Long identificadorProducto,
			@Param("identificadorCadena") Long identificadorCadena);

}
