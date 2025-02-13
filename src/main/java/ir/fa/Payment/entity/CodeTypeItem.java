package ir.fa.Payment.entity;



import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name = "CODE_TYPE_ITEM")
@Getter
@Setter
@Audited
public class CodeTypeItem extends BaseEntity{
    @ManyToOne
    @JoinColumn(name = "CODE_TYPE_ID",referencedColumnName = "ID")
    private CodeType codeType;

    @Column(name = "ENGLISH_TITLE")
    private String englishTitel;

    @Column(name = "FARSI_TITLE")
    private String farsiTitel;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;
}
