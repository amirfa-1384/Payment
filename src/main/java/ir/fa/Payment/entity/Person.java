package ir.fa.Payment.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PERSON")
@Getter
@Setter
@Audited
public class Person extends BaseEntity {
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "NATIONALCODE" , nullable = false)
    private String nationalCode;
    @Column(name = "FATHER_NAME")
    private String fatherName;

    @Column(name = "EMAIL")
    private String email;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "CONTACT_INFO_ID",referencedColumnName = "ID")
    private List<ContactInfo> contactInfos;

    @Column(name = "BIRTH_DATE")
    private Date birthDate;



}
