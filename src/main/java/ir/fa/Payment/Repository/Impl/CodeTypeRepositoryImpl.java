package ir.fa.Payment.Repository.Impl;

import ir.fa.Payment.Repository.Base.impl.BaseRepositoryImpl;
import ir.fa.Payment.Repository.CodeTypeRepository;
import ir.fa.Payment.entity.CodeType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CodeTypeRepositoryImpl extends BaseRepositoryImpl<CodeType> implements CodeTypeRepository {

}
