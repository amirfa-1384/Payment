package ir.fa.Payment.service.Base;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
@Transactional
public interface BaseService<D> {
    D save(D dto);
    D findById(Long id);

    List<D> findAll();
    boolean deleteById(Long id) throws Exception;

    boolean delete(D dto);
//    boolean softDelete(D dto);
}

