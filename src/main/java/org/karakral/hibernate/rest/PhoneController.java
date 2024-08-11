package org.karakral.hibernate.rest;


import org.karakral.hibernate.dto.request.PhoneDto;
import org.karakral.hibernate.service.PhoneService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/phones")
public class PhoneController {

    private final PhoneService phoneService;

    public PhoneController(PhoneService phoneService) {
        this.phoneService = phoneService;
    }

    @PostMapping("/add")
    public ResponseEntity <PhoneDto> addPhone(@RequestBody PhoneDto phoneDto) {
         phoneService.save(phoneDto);
         return null;
    }
}
