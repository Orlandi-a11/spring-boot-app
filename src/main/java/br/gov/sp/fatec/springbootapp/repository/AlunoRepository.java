package br.gov.sp.fatec.springbootapp.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.gov.sp.fatec.springbootapp.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    @Query("SELECT a FROM Aluno a WHERE LOWER(a.nomeCompleto) LIKE %:keyword% OR a.dataMatricula < :maxDate")
    List<Aluno> findByKeywordOrDataMatriculaBefore(@Param("keyword") String keyword, @Param("maxDate") LocalDateTime maxDate);
    
}
