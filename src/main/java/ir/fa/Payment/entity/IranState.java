package ir.fa.Payment.entity;

import ir.fa.Payment.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "IRANSTATE")
@Getter
@Setter
@Audited
public class IranState extends BaseEntity {
    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String Code;

    @OneToOne
    @JoinColumn(name = "PARENT_ID",referencedColumnName = "ID")
    private IranState iranState;

    @OneToOne
    @JoinColumn(name = "TYPE",referencedColumnName = "ID")
    private CodeTypeItem  type;

}
