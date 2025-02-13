package ir.fa.Payment.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST_WORK_FLOW")
@Getter
@Setter
@Audited
public class RequestWorkFlow extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "REQUEST_TYPE_ID",referencedColumnName = "ID")
    private CodeType RequestType;

    @ManyToOne
    @JoinColumn(name = "WORK_FLOW_ID",referencedColumnName = "ID")
    private WorkFlow workFlow;
}
