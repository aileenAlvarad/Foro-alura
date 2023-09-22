package com.foro.buscador.topicos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;
import com.foro.topicos.TopicosEntity;

//Get http://localhost:8080/foro/buscar/topicos/{id}

@RequestMapping("/buscar")
@Controller
@RestController
public class BuscadorTopicosController extends BaseController {

	private BuscadorTopicosService buscadorTopicosService;

	public BuscadorTopicosController(BuscadorTopicosService buscadorTopicosService) {
		this.buscadorTopicosService = buscadorTopicosService;
	}

	@GetMapping(value = "/topicos/{id}")
	@ResponseStatus(HttpStatus.OK)
	public TopicosEntity buscarTopicos(@PathVariable Long id) {
		return null;
	}

	@GetMapping(value = "/consultar-topicos")
	@ResponseStatus(HttpStatus.OK)
	public List<TopicosEntity> consultar() {
		return null;
	}  
}

