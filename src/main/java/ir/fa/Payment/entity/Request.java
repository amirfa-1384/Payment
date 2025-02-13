package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST")
@Getter
@Setter
@Audited
public class Request extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID",referencedColumnName = "ID")
    private Account account;


    @OneToOne
    @JoinColumn(name = "REQUEST_TYPE_ID",referencedColumnName = "ID")
    private CodeType requestType;

    @OneToOne
    @JoinColumn(name = "REQEUST_STATE_ID" ,referencedColumnName = "ID")
    private CodeTypeItem requestState;

    @Column(name = "IS_DONE")
    private boolean IsDone;
}
