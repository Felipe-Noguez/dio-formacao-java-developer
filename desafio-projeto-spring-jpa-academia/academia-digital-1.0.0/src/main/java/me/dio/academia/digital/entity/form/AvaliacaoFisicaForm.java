package me.dio.academia.digital.entity.form;

import lombok.Data;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
public class AvaliacaoFisicaForm {

  @Positive(message = "O id do aluno precisa ser positivo.")
  private Long alunoId;

  @NotNull(message = "Preencha o campo peso corretamente.")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente.")
  @Positive(message = "'${validatedValue}', precisa ser positivo.")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}")
  private double altura;
}
