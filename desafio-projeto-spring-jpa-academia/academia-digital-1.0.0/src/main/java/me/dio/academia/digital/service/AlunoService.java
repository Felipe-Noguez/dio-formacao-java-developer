package me.dio.academia.digital.service;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.infra.utils.JavaTimeUtils;
import me.dio.academia.digital.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Service
public class AlunoService implements IAlunoService{

    private final AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());
        alunoRepository.save(aluno);

        return aluno;
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(Long id) {
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

    @Override
    public List<Aluno> getAllByDataNascimento(String dataDeNascimento) {
        if (dataDeNascimento.equals(null)) {
            return alunoRepository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return alunoRepository.findByDataDeNascimento(localDate);
        }
    }

    public Aluno buscarAlunoPorId (Long idAluno) {
        return alunoRepository.findById(idAluno).get();
    }
}
