package com.foro.topicos;

import java.time.LocalDate;

import com.foro.usuario.UsuarioEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class TopicosEntity {  
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String titulo; 
	private String mensaje;
	private LocalDate fechaCreacion;
	
	@ManyToOne(fetch= FetchType.EAGER)
	@JoinColumn(name="usuario_fk")
	private UsuarioEntity usuarioEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public void setUsuarioEntity(UsuarioEntity usuarioEntity) {
		this.usuarioEntity = usuarioEntity;
	}

	@Override
	public String toString() {
		return "TopicosEntity [id=" + id + ", titulo=" + titulo + ", mensaje=" + mensaje + ", fechaCreacion="
				+ fechaCreacion + ", usuarioEntity=" + usuarioEntity + "]";
	}
	
	
}
