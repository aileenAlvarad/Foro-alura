package com.foro.usuario;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {


    private UsuariosRepository usuariorepository;

    public UsuarioService(UsuariosRepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }



   

}
