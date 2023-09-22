package com.foro.buscador.topicos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foro.topicos.TopicosEntity;

public interface BuscadorTopicosRepository extends JpaRepository<TopicosEntity, Long>{

}
