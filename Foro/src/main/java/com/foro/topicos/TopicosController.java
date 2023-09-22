package com.foro.topicos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;

//POST http://localhost:8080/foro/topicos/  

@RequestMapping("/topicos")
@Controller
@RestController 
public class TopicosController extends BaseController{
	
	private TopicosService topicosService;
	
	public TopicosController(TopicosService topicosService) {
		this.topicosService = topicosService;
	}

	@PostMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public TopicosEntity crearTopico(@RequestBody TopicosDTO topicosDTO) {
		return null;
	}
	 

	@PutMapping(value = "/")
	@ResponseStatus(HttpStatus.OK)
	public TopicosEntity modificar(@RequestBody TopicosDTO reservacionDTO) {
		return null;
	}
	
	@DeleteMapping(value = "/eliminar/{id}")
	@ResponseStatus(HttpStatus.OK) 
	public Long eliminarTopico(@PathVariable Long id) {
		return null;
	}
	
	
}
