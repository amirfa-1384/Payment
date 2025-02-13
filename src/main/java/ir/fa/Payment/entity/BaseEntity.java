package ir.fa.Payment.entity;



import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name = "CREATEDATE")
    private Date createDate;
    @Column(name = "MODIFYDATE")
    private Date ModifyDate;
    @Column(name = "DELETEDATE")
    private Date DeleteDate;
    @Column(name = "CREATE_USER")
    private String createUser;
    @Column(name = "MODIFY_USER")
    private String ModifyUser;
    @Column(name = "DELETE_USER")
    private String deleteUser;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "DATASTATE")
    private Integer dataState;
}
