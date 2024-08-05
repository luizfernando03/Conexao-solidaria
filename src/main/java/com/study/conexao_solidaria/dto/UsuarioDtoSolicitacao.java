package com.study.conexao_solidaria.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDtoSolicitacao {

    private Long id;
    private String nome;
    private String telefone;

}
