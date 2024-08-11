package org.karakral.hibernate.mapping;

import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PhoneMapper extends EntityMapper<PhoneDto, Phone> {

    Phone toEntity(PhoneDto phoneDto);
    PhoneDto toDto(Phone phone);
}
