package me.dio.academia.digital.entity.form;

import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
public class AlunoForm {

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 90, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @CPF(message = "'${validatedValue}' é inválido.")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente.")
  @Size(min = 3, max = 90, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente.")
  @Past(message = "Data '${validatedValue}' é inválido.")
  private LocalDate dataDeNascimento;
}
