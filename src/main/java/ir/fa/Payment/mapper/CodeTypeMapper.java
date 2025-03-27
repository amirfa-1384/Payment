package ir.fa.Payment.mapper;

import ir.fa.Payment.dto.CodeTypeDTO;
import ir.fa.Payment.entity.CodeType;
import ir.fa.Payment.mapper.Base.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.factory.Mappers;

@Mapper(nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL,componentModel = "spring")
public interface CodeTypeMapper extends BaseMapper<CodeType,CodeTypeDTO> {
}
