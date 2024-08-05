package com.study.conexao_solidaria.service;

import com.study.conexao_solidaria.dto.UsuarioDtoResponse;
import com.study.conexao_solidaria.enums.Categorias;
import com.study.conexao_solidaria.model.UsuarioModel;
import com.study.conexao_solidaria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

//    public List<UsuarioDtoResponse> buscarVoluntarios(){
//        List<UsuarioModel> voluntarios = usuarioRepository.findByCategoria(Categorias.VOLUNTARIO);
//        List<UsuarioDtoResponse> dtoVoluntarios = new ArrayList<>();
//        UsuarioDtoResponse volunt;
//
//        for (UsuarioModel v : voluntarios) {
//            volunt = new UsuarioDtoResponse(v.getId()
//                    , v.getCategoria(), v.getDeficiencias(), v.getNome(), v.getTelefone(),
//                    v.getEmail(), v.getLatitude(),
//                    v.getLongitude());
//            dtoVoluntarios.add(volunt);
//        }
//        return dtoVoluntarios;
//    }

}
