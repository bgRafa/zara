package prueba.zara.project.features.cuPrincipal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import prueba.zara.project.features.cuPrincipal.model.domain.ZaraCuPrincipalDomainModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalInputViewModel;
import prueba.zara.project.features.cuPrincipal.model.view.ZaraCuPrincipalViewModel;
import prueba.zara.project.model.domain.ZaraPricesDomainModel;
import prueba.zara.project.model.entity.ZaraPricesEntity;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ZaraCuPrincipalMapper {

	ZaraCuPrincipalMapper INSTANCE = Mappers.getMapper(ZaraCuPrincipalMapper.class);

	ZaraCuPrincipalDomainModel toDomain(ZaraCuPrincipalInputViewModel input);

	@Mapping(target = "brandId", source = "id.brandId")
	@Mapping(target = "productId", source = "id.productId")
	@Mapping(target = "idTarifaAplicable", source = "id.idTarifaAplicable")
	ZaraPricesDomainModel toDomain(ZaraPricesEntity input);

	ZaraCuPrincipalViewModel toView(ZaraPricesDomainModel domain);
}
