package me.dio.academia.digital.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "avaliacao_fisica")
public class AvaliacaoFisica {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name = "peso_atual")
  private double peso;

  @Column(name = "altura")
  private double altura;

  @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;
}
