package org.karakral.hibernate.enitity;

import jakarta.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "phone")
//@EntityListeners(AuditingEntityListener.class)
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "phone_name", nullable = false)
    private String phoneName;

    @Column(name = "os", nullable = false)
    private String os;




}
