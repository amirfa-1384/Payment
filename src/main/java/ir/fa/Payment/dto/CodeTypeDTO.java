package ir.fa.Payment.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.fa.Payment.dto.Base.BaseDTO;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CodeTypeDTO extends BaseDTO {

    private String englishTitel;
    private String farsiTitel;
    @JsonProperty("isActive")
    private boolean isActive;


}
