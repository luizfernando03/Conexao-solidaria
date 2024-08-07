package com.study.conexao_solidaria.controller;

import com.study.conexao_solidaria.model.dto.UsuarioDtoLogin;
import com.study.conexao_solidaria.model.dto.UsuarioDtoResponse;
import com.study.conexao_solidaria.model.dto.UsuarioDtoSolicitacao;
import com.study.conexao_solidaria.model.dto.VoluntarioDtoId;
import com.study.conexao_solidaria.model.UsuarioModel;
import com.study.conexao_solidaria.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path = "/create")
    public ResponseEntity<UsuarioDtoResponse> cadastrarUsuario(@RequestBody @Valid UsuarioModel usuarioModel) throws Exception {
        UsuarioDtoResponse usuario = usuarioService.cadastrar(usuarioModel);
        return new ResponseEntity<>(usuario, HttpStatus.CREATED);
    }

    @PatchMapping(path = "/atualizar/{id}")
    public ResponseEntity<UsuarioDtoResponse> atualizar(@Valid @PathVariable Long id, @RequestBody UsuarioModel usuarioModel) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.atualizar(usuarioModel, id));
    }

    @GetMapping(path = "/solicitacao/{id}")
    public ResponseEntity<UsuarioDtoSolicitacao> solicitacaoAjuda(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.solicitarAjuda(id));
    }

    @DeleteMapping(path = "/{id}")
    public String deletar(@PathVariable Long id) {
        usuarioService.deletar(id);
        return "Usuário deletado com sucesso!";
    }

    @GetMapping(path = "/voluntario")
    public ResponseEntity<List<VoluntarioDtoId>> buscaPorVoluntariosId(Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarVoluntarioId(id));
    }

    @PostMapping(path = "/login")
    public ResponseEntity<UsuarioDtoLogin> loginUsuario(@RequestBody UsuarioModel usuarioModel) throws Exception {
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.loginUser(usuarioModel));
    }

}
