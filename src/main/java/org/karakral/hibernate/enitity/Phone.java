package org.karakral.hibernate.enitity;

import jakarta.persistence.*;

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

    @Version
    private Long version = 0L;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
