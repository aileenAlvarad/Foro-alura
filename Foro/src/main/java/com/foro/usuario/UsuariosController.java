package com.foro.usuario;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crosscutting.BaseController;

//GET: http://localhost:8080/foro/

@RestController
@RequestMapping("/usuarios")
public class UsuariosController extends BaseController {








    private UsuarioService usuarioService;

    public UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }



    @GetMapping(value = "all-users")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List <UsuarioEntity> consultarTodos( ) {
        
        return usuarioService.consultarTodo();

    }










    @PostMapping(value ="/")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {


            return usuarioService.crearUsuario(usuarioDTO);










    }











}












