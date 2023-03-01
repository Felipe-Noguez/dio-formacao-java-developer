package me.dio.academia.digital.controller;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.MatriculaService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    private final MatriculaService matriculaService;

    @PostMapping
    public Matricula create (@Valid @RequestBody MatriculaForm matriculaForm) {
        return matriculaService.create(matriculaForm);
    }

    @GetMapping
    public List<Matricula> getAll () {
        return matriculaService.getAll();
    }

    @GetMapping("/alunos-por-bairro")
    public List<Matricula> getAllAlunosPorBairro (@RequestParam(value = "bairro", required = false) String bairro) {
        return matriculaService.getAllAlunosPorBairro(bairro);
    }
}
