package org.karakral.hibernate.enitity;


import jakarta.persistence.*;
import org.karakral.hibernate.enums.AccountTypeEnum;


@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;


    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "account_type")
    private AccountTypeEnum accountType;

   // One-to-one bidirectional
    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Member member;



}
