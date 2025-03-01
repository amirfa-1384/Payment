package ir.fa.Payment.dto.Base;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BaseDTO {
    private Long id;
    private Date createDate;
    private Date modifyDate;
    private Date deleteDate;
    private String createUser;
    private String modifyUser;
    private String deleteUser;
    private Integer version;
    private Integer dataState;
}


