package br.edu.infnet.AT_JavaAPI.controller;

import br.edu.infnet.AT_JavaAPI.model.negocio.Usuario;
import br.edu.infnet.AT_JavaAPI.model.service.UsuarioService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
    @Autowired
    private UsuarioService usuarioService;
    
    @PostMapping(value = "/usuario/cadastrar")
    public Usuario cadastrarUsuario(Usuario usuario) throws SQLException {
        return usuarioService.salvar(usuario);
    }
    
    @GetMapping(value = "/usuario/lista")
    public List<Usuario> listaUsuarios(){ 	
    	return usuarioService.acharListagem();
    }
    
    @GetMapping(value = "/usuario/{id}")
    public Usuario usuariosPorId(@PathVariable Integer id){ 	
    	return usuarioService.consultarPorID(id);
    }
    
    @PutMapping(value = "/usuario/alterar/{id}")
    public void alterarProduto(@PathVariable Integer id, @RequestBody Usuario usuario) {  
        usuarioService.alterarCadastro(id, usuario);
    }
  
    @DeleteMapping(value = "/usuario/deletar/{id}")
    public void excluirUsuario(@PathVariable Integer id){
    	usuarioService.deletaUsuario(id);
    }
 
}