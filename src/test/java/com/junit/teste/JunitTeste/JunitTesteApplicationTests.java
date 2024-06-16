package com.junit.teste.JunitTeste;

import com.junit.teste.JunitTeste.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class JunitTesteApplicationTests {
	private UsuarioService usuarioService = new UsuarioService();

	@Test
	void createUser() {

		// AAA
		//Arange
		User usuario = new User("icaro","12344");
		//Act
		List<User> usuarios = usuarioService.create(usuario);
		//Assert
		assertEquals(1,usuarios.size());
		assertEquals(usuario,usuarios.get(0));
	}

	@Test
	void createUser_ThrowsException(){

		User usuario = new User("icaro","12344");
		usuarioService.create(usuario);
		assertThrows(RuntimeException.class,() -> usuarioService.create(usuario));

	}

}
