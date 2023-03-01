package me.dio.academia.digital.controller;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.service.AvaliacaoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    private final AvaliacaoService avaliacaoService;

    @PostMapping
    public AvaliacaoFisica create (@RequestBody AvaliacaoFisicaForm avaliacaoFisicaForm) {
        return avaliacaoService.create(avaliacaoFisicaForm);
    }
}
