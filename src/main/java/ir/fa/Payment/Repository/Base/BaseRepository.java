package ir.fa.Payment.Repository.Base;

import ir.fa.Payment.entity.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public interface BaseRepository <T extends BaseEntity> extends CRUDBaseRepository<T> {

}
