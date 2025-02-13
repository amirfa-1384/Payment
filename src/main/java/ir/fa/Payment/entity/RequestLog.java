package ir.fa.Payment.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_LOG")
@Getter
@Setter
@Audited
public class RequestLog extends BaseEntity {

    @Column(name = "REQUEST_ID",nullable = false)
    private Long requestId;
    @Column(name = "ACCOUNT_ID",nullable = false)
    private Long accountId;
    @Column(name = "DESCRIPTION")
    private String description;


}
