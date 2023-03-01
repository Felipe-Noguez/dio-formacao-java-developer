package me.dio.academia.digital.service;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MatriculaService implements IMatriculaService{

    private final MatriculaRepository matriculaRepository;

    private final AlunoService alunoService;

    @Override
    public Matricula create(MatriculaForm form) {
        Matricula matricula = new Matricula();
        Aluno aluno = alunoService.buscarAlunoPorId(form.getAlunoId());

        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Matricula> getAllAlunosPorBairro(String bairro) {
        if (bairro.equals(null)) {
            return matriculaRepository.findAll();
        } else {

            return matriculaRepository.findByAluno_Bairro(bairro);
        }
    }
}
