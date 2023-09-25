package com.foro.topicos;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.foro.usuario.UsuarioEntity;

@Service
public class TopicosService {

	private TopicosRepository topicosRepository;

	public TopicosService(TopicosRepository topicosRepository) {
		this.topicosRepository = topicosRepository;
	}

	
	//Los datos que envia el usuario llegan como topicoDTO
	//Se crea un entity y se le asignan los datos del DTO
	public TopicosEntity crearTopico(TopicoDTO topicoDTO) { 
		TopicosEntity topicosEntity = new TopicosEntity();
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setId(topicoDTO.usuarioFk());
		
		topicosEntity.setTitulo(topicoDTO.titulo());
		topicosEntity.setMensaje(topicoDTO.mensaje()); 
		topicosEntity.setUsuarioEntity(usuarioEntity);
		topicosEntity.setFechaCreacion(LocalDate.now());
		return topicosRepository.save(topicosEntity);
	}  
	
	public TopicosEntity modificarTopicoPorId(TopicoDTO topicoDTO) {
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setId(topicoDTO.usuarioFk());
		
		TopicosEntity topicosEntity = topicosRepository.findById(topicoDTO.id()).orElse(null);
		topicosEntity.setTitulo(topicoDTO.titulo()); 
		topicosEntity.setMensaje(topicoDTO.mensaje());
		topicosEntity.setUsuarioEntity(usuarioEntity);
		topicosEntity.setFechaCreacion(LocalDate.now());
		return topicosRepository.save(topicosEntity);
	}
	
	public Long eliminarTopico(Long id) {
		topicosRepository.deleteById(id);
		return id; 
	}
}


