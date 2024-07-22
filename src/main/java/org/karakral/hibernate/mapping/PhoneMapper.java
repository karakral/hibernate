package org.karakral.hibernate.mapping;

import org.karakral.hibernate.config.ConfigMapper;
import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;
import org.mapstruct.Mapper;

//@Mapper(config = ConfigMapper.class)
@Mapper(componentModel = "spring")
public interface PhoneMapper {

    Phone toEntity(PhoneDto phoneDto);
    PhoneDto fromEntity(Phone phone);
}
