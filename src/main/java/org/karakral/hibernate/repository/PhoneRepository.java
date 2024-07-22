package org.karakral.hibernate.repository;

import org.karakral.hibernate.enitity.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepository  extends JpaRepository<Phone, Long> {

}
