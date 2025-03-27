package ir.fa.Payment.service.impl;

import ir.fa.Payment.Repository.Base.BaseRepository;
import ir.fa.Payment.Repository.CodeTypeRepository;
import ir.fa.Payment.dto.CodeTypeDTO;
import ir.fa.Payment.entity.CodeType;
import ir.fa.Payment.entity.base.BaseEntity;
import ir.fa.Payment.mapper.Base.BaseMapper;
import ir.fa.Payment.mapper.CodeTypeMapper;
import ir.fa.Payment.service.Base.BaseService;
import ir.fa.Payment.service.Base.impl.BaseServiceImpl;
import ir.fa.Payment.service.CodeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;


@Transactional
@Service
public class CodeTypeServiceImpl extends BaseServiceImpl<CodeType, CodeTypeDTO, CodeTypeMapper> implements CodeTypeService {


}
