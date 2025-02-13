package ir.fa.Payment.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "ACCOUNT")
@Getter
@Setter
@Audited
public class Account extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "PERSON_ID",referencedColumnName = "ID")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "BANK_ID",referencedColumnName = "ID")
    private BankInfo bankInfo;

    @OneToOne
    @JoinColumn(name = "ACCOUNT_TYPE",referencedColumnName = "ID")
    private CodeType accountType;

    @Column(name = "ACCOUNT_BALANCE")
    private double Balance;
}
