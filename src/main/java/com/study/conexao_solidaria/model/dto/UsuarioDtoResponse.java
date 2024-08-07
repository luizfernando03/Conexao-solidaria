package com.study.conexao_solidaria.model.dto;

import com.study.conexao_solidaria.enums.Categorias;
import com.study.conexao_solidaria.enums.TiposDeDeficiencias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDtoResponse {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Categorias categoria;
    private TiposDeDeficiencias deficiencias;
    private String nome;
    private String telefone;
    private String email;
    private double latitude;
    private double longitude;

}
