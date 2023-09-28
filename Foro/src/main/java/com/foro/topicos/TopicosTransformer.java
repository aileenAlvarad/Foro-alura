package com.foro.topicos;

public class TopicosTransformer {
	
	public static TopicosResponseDTO topicosResponseDTO(TopicosEntity topicosEntity) {
		return new TopicosResponseDTO(topicosEntity.getId(), topicosEntity.getTitulo(), topicosEntity.getMensaje(), topicosEntity.getUsuarioEntity().getId(), topicosEntity.getUsuarioEntity().getName());
		
	}

}
