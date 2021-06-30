package br.edu.infnet.appatpb.model.repository;

import br.edu.infnet.appatpb.model.negocio.Aluno;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface IAlunoRepository extends CrudRepository<Aluno, Integer> {
    @Query(value = "SELECT a FROM Aluno a WHERE a.nomeAluno LIKE '%' || :keyword || '%'")   
    public List<Aluno> search(@Param("keyword") String keyword);
}
