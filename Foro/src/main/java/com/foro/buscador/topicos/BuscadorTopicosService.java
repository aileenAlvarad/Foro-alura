package com.foro.buscador.topicos;

import org.springframework.stereotype.Service;

import com.foro.topicos.TopicosEntity;

@Service
public class BuscadorTopicosService {
	
	private BuscadorTopicosRepository buscadorTopicosRepository;
	public BuscadorTopicosService(BuscadorTopicosRepository buscadorTopicosRepository) {
		this.buscadorTopicosRepository = buscadorTopicosRepository;
	}


	public TopicosEntity buscarTopicoPorId(Long id) {
		return buscadorTopicosRepository.findById(id).get();
		
	} 
}
