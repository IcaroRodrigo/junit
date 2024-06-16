package com.junit.teste.JunitTeste.controller;

import com.junit.teste.JunitTeste.User;
import com.junit.teste.JunitTeste.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    public List<User> create(@RequestBody User user){
        List<User> usuarios = usuarioService.create(user);
        return usuarios;
    }
}
