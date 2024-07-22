package org.karakral.hibernate.service.impl;

import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;
import org.karakral.hibernate.mapping.PhoneMapper;
import org.karakral.hibernate.repository.PhoneRepository;
import org.karakral.hibernate.service.PhoneService;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {
    private final PhoneRepository phoneRepository;
    private final PhoneMapper phoneMapper;

    public PhoneServiceImpl(PhoneRepository phoneRepository, PhoneMapper phoneMapper) {
        this.phoneRepository = phoneRepository;
        this.phoneMapper = phoneMapper;
    }

    @Override
    public void save(PhoneDto phoneDto) {
        Phone phone = phoneMapper.toEntity(phoneDto);
        phoneRepository.save(phone);
    }
}
