package org.karakral.hibernate.service;


import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;

public interface PhoneService {

    public void save(PhoneDto phoneDto);
    public Phone update(PhoneDto phoneDto);
    public void delete(PhoneDto phoneDto);
    public void getAll(PhoneDto phoneDto);

}
