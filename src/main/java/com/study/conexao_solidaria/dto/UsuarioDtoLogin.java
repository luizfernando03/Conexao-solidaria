package com.study.conexao_solidaria.dto;

import com.study.conexao_solidaria.enums.Categorias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDtoLogin {
    private static final long serialVersionUID = 1L;

    private Long id;
    private Categorias categorias;
    private String nome;


}
