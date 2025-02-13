package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "CONTACT_INFO")
@Getter
@Setter
@Audited
public class ContactInfo extends BaseEntity {

    @Column(name = "PHONE_NUMBER",nullable = false)
    private String phoneNumber;

    @Column(name = "TEL_NUMBER")
    private String telNumber;

    @Column(name = "POSTALCODE")
    private String postalCode;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;

    @OneToOne(optional = false)
    @JoinColumn(name = "CITY_ID",referencedColumnName = "ID")
    private IranState city;


}
