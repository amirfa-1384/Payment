package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_INFO")
@Getter
@Setter
@Audited
public class BankInfo extends BaseEntity {

    @Column(name = "BANK_NAME")
    private String bankName;

    @Column(name = "CODE")
    private String Code;
}
