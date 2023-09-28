package com.foro.urls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class HotelUrlsController {

	@GetMapping({"/login3"})
	public String landingPage3( ) {
		  System.out.println("Login page");
		return "/loginpage.html";
	}
	
	
	@GetMapping({"/login", "/"})
	public String pagesLogin( ) {
		  System.out.println("Login page");
		return "/pages-login.html";
	} 
	
	@GetMapping({"/crear-topico"}) //http://localhost:8080/foro/crear-topico
	public String crearTopico( ) {
		  System.out.println("Creando topico");
		return "/crearTopico.html";
	} 
	
	@GetMapping({"/altaUsuario"})
	public String altaUsuario( ) {
		return "/registrarUsuario.html";
	} 
	
	@GetMapping({"/buscar"}) //http://localhost:8080/hotel/buscar
	public String buscador( ) {
		  System.out.println("Buscador");
		return "/buscar.html";
	} 
	
	@GetMapping({"/modificarReservaciones"}) // http://localhost:8080/hotel/modificarReservaciones?id=1
	public String modificadorReservaciones( ) {
		  System.out.println("modificadorReservaciones");
		return "/modificarReservaciones.html";
	}


	@GetMapping({"/modificarHuesped"}) // http://localhost:8080/hotel/modificarHuesped?id=1
	public String modificadorHuesped( ) {
		System.out.println("modificadorReservaciones");
		return "/modificarHuesped.html";
	}


	
}
