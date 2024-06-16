package com.junit.teste.JunitTeste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserIt {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void createUser(){
        User usuario = new User("icaro","12344");
        User[] usuarios = testRestTemplate.postForObject("/usuario",usuario,User[].class);

        assertNotNull(usuarios);
        assertEquals(1,usuarios.length);
        assertEquals(usuario,usuarios[0]);
        assertThrows(RuntimeException.class,() -> testRestTemplate.postForObject("/usuario",usuario,User[].class));
    }
}
