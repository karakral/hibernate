package org.karakral.hibernate.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.enitity.Phone;
import org.karakral.hibernate.mapping.PhoneMapper;
import org.karakral.hibernate.repository.PhoneRepository;
import org.karakral.hibernate.service.PhoneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    //TODO read transactional
    @Transactional
    @Override
    public Phone update(PhoneDto phoneDto) {
        Phone entity = phoneRepository.findById(phoneDto.getId()).orElseThrow(() ->
        new EntityNotFoundException("Entity with ID " + phoneDto.getId() + " does not exist."));
        Phone phone = phoneMapper.toEntity(phoneDto);
        return phoneRepository.save(phone);

        // TODO ADD Log
    }

    @Override
    public void delete(PhoneDto phoneDto) {
        Phone phone = phoneMapper.toEntity(phoneDto);
        phoneRepository.deleteById(phoneDto.getId());
    }

    @Override
    public void getAll(PhoneDto phoneDto) {
            //TODO pagination
    }
}
