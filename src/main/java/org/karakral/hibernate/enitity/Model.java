package org.karakral.hibernate.enitity;


import jakarta.persistence.*;
import org.hibernate.boot.registry.selector.spi.StrategyCreator;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "model")
public class Model {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long id;
}
