package com.foro.login;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.foro.usuario.UsuarioEntity;

@Service
public class LoginService {

	private LoginRepository loginRepository;
	
	public LoginService(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	
	public UsuarioEntity login(LoginDTO loginDTO) {
		
		Optional<UsuarioEntity> huespedO = loginRepository.findByNameAndPassword("aaa", "123");
		if (huespedO.isEmpty()) {
			UsuarioEntity huesped = new UsuarioEntity();
			huesped.setName("aaa");
			huesped.setPassword("123");
			loginRepository.save(huesped);
		}
		return loginRepository.findByNameAndPassword(loginDTO.usuario(), loginDTO.password())
				.orElseThrow( ()  -> new RuntimeException("Usuario no encontrado"));
	}

}
