package me.dio.academia.digital.controller;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAll() {
        return alunoService.getAll();
    }

    @GetMapping("/data-nascimento")
    public List<Aluno> getAllByDataNascimento(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento) {
        return alunoService.getAllByDataNascimento(dataDeNascimento);
    }

    @PostMapping
    public Aluno create (@Valid @RequestBody AlunoForm alunoForm) {
        return alunoService.create(alunoForm);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica (@PathVariable Long id) {
        return alunoService.getAllAvaliacaoFisica(id);
    }
}
