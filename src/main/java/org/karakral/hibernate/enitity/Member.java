package org.karakral.hibernate.enitity;

import jakarta.persistence.*;


@Entity
@Table(name = "member")
public class Member {
    //add dynamic search
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;




    //One-to-one bidirectional
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id")
    private Account account;


}
