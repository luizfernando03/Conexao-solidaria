package com.study.conexao_solidaria.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.study.conexao_solidaria.enums.Categorias;
import com.study.conexao_solidaria.enums.TiposDeDeficiencias;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;


import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class UsuarioModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Informe o nome")
    private String nome;

    @NotBlank(message = "Colocar CPF válido")
    @CPF
    private String cpf;

    @Column(length = 50, nullable = false)
    private LocalDate dataDeNascimento;

    @NotBlank(message = "Colocar e-mail valido")
    @Email
    private String email;

    @Column(length = 30, nullable = false)
    private String telefone;

    @Column
    @Enumerated(EnumType.STRING)
    private Categorias categoria;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private double latitude;

    @Column(nullable = false)
    private double longitude;

    @Column
    private TiposDeDeficiencias deficiencias;

    @JsonIgnore
    @Column
    private Long idVoluntario;


}
