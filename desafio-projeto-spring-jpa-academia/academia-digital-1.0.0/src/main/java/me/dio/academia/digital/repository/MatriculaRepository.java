package me.dio.academia.digital.repository;

import me.dio.academia.digital.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

//    @Query(value = " SELECT * FROM matricula m " +
//            " INNER JOIN aluno a ON m.aluno_id = a.id " +
//            " WHERE a.bairro = :bairro ", nativeQuery = true)

//    @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro ")
//    List<Matricula> buscarAlunoPorBairro(String bairro);


    List<Matricula> findByAluno_Bairro(String bairro);
}
