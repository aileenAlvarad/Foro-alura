package com.foro.login;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foro.usuario.UsuarioEntity;

public interface LoginRepository extends JpaRepository<UsuarioEntity, Long>{

	 public Optional<UsuarioEntity> findByNameAndPassword(String name, String password);
}
