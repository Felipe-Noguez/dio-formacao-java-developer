package me.dio.academia.digital.entity.form;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class MatriculaForm {

  @NotNull(message = "Preencha o campo ID do aluno corretamente.")
  @Positive(message = "O id do aluno precisa ser positivo.")
  private Long alunoId;

}
