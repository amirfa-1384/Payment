package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
@Getter
@Setter
@Audited
public class Users extends BaseEntity {
    @Column(name = "USER_NAME",nullable = false)
    private String userName;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    @OneToOne(optional = false)
    @JoinColumn(name = "PERSON_ID",referencedColumnName = "ID")
    private Person person;

}
