package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Usuario;
import br.edu.infnet.appatpb.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class AppController {
    
    @Autowired
    private UsuarioService usuarioService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String telaLogin() {
        return "login";
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String telaLogout() {
        return "redirect:/";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String telaIndex(Model model, @SessionAttribute("user") Usuario usuario) {

        model.addAttribute("usuarioQtd", usuarioService.obterLista().size());

        return "index";
    }                
}