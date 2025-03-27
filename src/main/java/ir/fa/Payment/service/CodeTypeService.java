package ir.fa.Payment.service;

import ir.fa.Payment.dto.CodeTypeDTO;
import ir.fa.Payment.entity.CodeType;
import ir.fa.Payment.service.Base.BaseService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
public interface CodeTypeService extends BaseService<CodeTypeDTO> {

}
