package com.foro.topicos;

import org.springframework.stereotype.Service;

@Service
public class TopicosService {

	private TopicosRepository topicosRepository;

	public TopicosService(TopicosRepository topicosRepository) {
		this.topicosRepository = topicosRepository;
	}



}
