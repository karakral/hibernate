package org.karakral.hibernate.enitity;


import jakarta.persistence.*;

@Entity
@Table(name = "passport")
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "serial_number")
    private String serialNumber;


}
