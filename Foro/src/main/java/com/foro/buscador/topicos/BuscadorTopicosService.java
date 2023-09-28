package com.foro.buscador.topicos;

import java.util.List;

import org.springframework.stereotype.Service;

import com.foro.topicos.TopicosEntity;
import com.foro.topicos.TopicosResponseDTO;
import com.foro.topicos.TopicosTransformer;

@Service
public class BuscadorTopicosService {
	
	private BuscadorTopicosRepository buscadorTopicosRepository;
	public BuscadorTopicosService(BuscadorTopicosRepository buscadorTopicosRepository) {
		this.buscadorTopicosRepository = buscadorTopicosRepository;
	}


	public TopicosEntity buscarTopicoPorId(Long id) {
		return buscadorTopicosRepository.findById(id).get();
		
	}  
	
	public List<TopicosResponseDTO> consultarTodosLosTopicos() {
		List<TopicosEntity> topicos =buscadorTopicosRepository.findAll();
		return topicos.stream().map(TopicosTransformer::topicosResponseDTO).toList();
	
	} 
	

}