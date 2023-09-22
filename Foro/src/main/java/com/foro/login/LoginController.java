package com.foro.login;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;
import com.foro.usuario.UsuarioEntity;

// POST http://localhost:8080/hotel/login/  {"usuario":"aaa","password":"123"}
@RequestMapping("/login")
@Controller
@RestController
public class LoginController extends BaseController{
	
	private LoginService loginService;
	
	public LoginController(LoginService loginService){
		this.loginService = loginService;
	}

	
	@PostMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public UsuarioEntity login(@RequestBody LoginDTO loginDTO) {
		System.out.println("loginn");
		return loginService.login(loginDTO);
		
	}
	
}
