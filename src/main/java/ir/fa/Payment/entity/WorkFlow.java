package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORK_FLOW")
@Getter
@Setter
@Audited
public class WorkFlow extends BaseEntity {
    @OneToOne
    @JoinColumn(name = "NEXT_STEP_ID",referencedColumnName = "ID")
    private CodeTypeItem nextStepId;

    @OneToOne
    @JoinColumn(name = "CURRENT_STEP_ID",referencedColumnName = "ID")
    private CodeTypeItem curentStepId;

    @OneToOne
    @JoinColumn(name = "PROVINCE_STEP_ID",referencedColumnName = "ID")
    private CodeTypeItem previousStep_id;

    @OneToOne
    @JoinColumn(name = "REQUEST_TYPE_ID",referencedColumnName = "ID")
    private CodeTypeItem requestType;


}
