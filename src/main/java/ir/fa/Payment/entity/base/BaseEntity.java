package ir.fa.Payment.entity.base;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "CREATEDATE", updatable = false, nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreatedDate
    private Date createDate;
    @Column(name = "MODIFYDATE", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
    @LastModifiedDate
    private Date ModifyDate;
    @Column(name = "DELETEDATE")
    private Date DeleteDate;
    @Column(name = "CREATE_USER")
    private String createUser;
    @Column(name = "MODIFY_USER")
    private String ModifyUser;
    @Column(name = "DELETE_USER")
    private String deleteUser;
    @Column(name = "VERSION", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer version = 0;
    @Column(name = "DATASTATE", nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer dataState = 0 ;
}
