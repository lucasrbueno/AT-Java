package br.edu.infnet.appatpb.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.repository.IUsuarioRepository;
import java.util.List;
import org.springframework.data.domain.Sort;

@Service
public class UsuarioService {
	
    @Autowired
    private IUsuarioRepository usuarioRepository;

    public void incluir(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public List<Usuario> obterLista() {
        return (List<Usuario>) usuarioRepository.findAllByOrderByNome();
    }

    public void excluir(Integer id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario autenticacao(String email, String senha){
        return usuarioRepository.autenticacao(email, senha);
    }
    
    public Usuario consultarPorID(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}
