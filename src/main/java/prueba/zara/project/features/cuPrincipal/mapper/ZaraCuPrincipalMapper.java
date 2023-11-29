package prueba.zara.project.features.cuPrincipal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedSourcePolicy = ReportingPolicy.IGNORE, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ZaraCuPrincipalMapper {

	ZaraCuPrincipalMapper INSTANCE = Mappers.getMapper(ZaraCuPrincipalMapper.class);
}
