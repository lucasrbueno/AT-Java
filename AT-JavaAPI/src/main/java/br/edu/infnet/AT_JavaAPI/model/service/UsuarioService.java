package br.edu.infnet.AT_JavaAPI.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AT_JavaAPI.model.negocio.Usuario;
import br.edu.infnet.AT_JavaAPI.model.repository.IUsuarioRepository;


@Service
public class UsuarioService {
	
    @Autowired
    private IUsuarioRepository usuarioRepository;

    Usuario usuario = new Usuario();
    List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    public Usuario consultarPorID(Integer id){
        return usuarioRepository.findById(id).get();
    }

    public List<Usuario> acharListagem() {	
        return (List<Usuario>) usuarioRepository.findAll();
    }

    public void deletaUsuario(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public void alterarCadastro(Integer id, Usuario usuario){  
        usuario.setId(id);
        usuarioRepository.save(usuario);
    }	
}
