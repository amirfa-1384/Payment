package ir.fa.Payment.entity;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CODE_TYPE")
@Getter
@Setter
@Audited
public class CodeType extends BaseEntity {
    @Column(name = "ENGLISH_TITLE")
    private String englishTitel;

    @Column(name = "FARSI_TITLE")
    private String farsiTitel;

    @Column(name = "IS_ACTIVE")
    private boolean isActive;
}
