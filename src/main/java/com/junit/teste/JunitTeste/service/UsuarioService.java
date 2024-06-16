package com.junit.teste.JunitTeste.service;

import com.junit.teste.JunitTeste.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<User> usuarios = new ArrayList<>();

    public List<User> create(User usuario){

        if(usuarios.contains(usuario))
            throw new RuntimeException();

        usuarios.add(usuario);
        return usuarios;
    }
}
