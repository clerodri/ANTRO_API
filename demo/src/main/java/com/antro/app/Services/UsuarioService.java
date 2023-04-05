package com.antro.app.Services;


import com.antro.app.Models.Usuario;
import com.antro.app.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    public Usuario addUsuario(Usuario usuario){
            return  usuarioRepository.insert(usuario);
    }
}
