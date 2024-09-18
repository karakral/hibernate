package org.karakral.hibernate.enitity;


import jakarta.persistence.*;

@Entity
@Table(name = "factory")
public class Factory {
//TODO Mahsun add liquibase
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

}
