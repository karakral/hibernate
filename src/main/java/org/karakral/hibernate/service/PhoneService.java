package org.karakral.hibernate.service;


import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;

public interface PhoneService {

    public void save(PhoneDto phoneDto);

}
