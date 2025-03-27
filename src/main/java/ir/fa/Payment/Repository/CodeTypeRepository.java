package ir.fa.Payment.Repository;


import ir.fa.Payment.Repository.Base.BaseRepository;
import ir.fa.Payment.entity.CodeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeTypeRepository extends BaseRepository<CodeType> {

}
