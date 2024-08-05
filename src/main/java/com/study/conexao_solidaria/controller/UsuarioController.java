package com.study.conexao_solidaria.controller;

import com.study.conexao_solidaria.dto.UsuarioDtoResponse;
import com.study.conexao_solidaria.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(path = "/voluntarios")
    public ResponseEntity<List<UsuarioDtoResponse>> buscarVoluntarios() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarVoluntarios());
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDtoResponse>> buscarUsuarios() {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscar());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<UsuarioDtoResponse> buscaUsuarioPorId(@Valid @PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarID(id));
    }


}
