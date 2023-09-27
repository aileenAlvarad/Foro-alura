package com.foro.usuario;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {




    private UsuariosRepository usuariorepository;

    public UsuarioService(UsuariosRepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }


    public UsuarioEntity crearUsuario(UsuarioDTO usuarioDTO) {
        try {
            UsuarioEntity userEntity = new UsuarioEntity();
            userEntity.setId(usuarioDTO.id());
            userEntity.setName(usuarioDTO.name());
            userEntity.setPassword(usuarioDTO.password());
            return usuariorepository.save(userEntity);
        } catch (DataAccessException e) {
            // Manejar excepciones relacionadas con la base de datos, por ejemplo, problemas de conexión o consulta SQL inválida.
            // Puedes registrar la excepción o lanzar una excepción personalizada si es necesario.
            // Ejemplo: throw new MiExcepcionPersonalizada("Error al guardar el usuario", e);
            throw new RuntimeException("Error al guardar el usuario", e);
        } catch (Exception e) {
            // Manejar otras excepciones no relacionadas con la base de datos.
            // Puedes registrar la excepción o lanzar una excepción personalizada si es necesario.
            throw new RuntimeException("Error inesperado al crear el usuario", e);
        }
    }


    public List<UsuarioEntity> consultarTodo() {
        return usuariorepository.findAll();
    }
}
