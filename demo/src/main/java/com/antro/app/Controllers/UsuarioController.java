package com.antro.app.Controllers;


import com.antro.app.Models.Device;
import com.antro.app.Models.Usuario;
import com.antro.app.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;
    @PostMapping("/usuarios")
    public ResponseEntity<?> createDevice(@RequestBody Usuario user){
        return new ResponseEntity<>(usuarioService.addUsuario(user), HttpStatus.CREATED);
    }
}
