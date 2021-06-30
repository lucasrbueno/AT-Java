package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Aluno;
import br.edu.infnet.appatpb.model.service.AlunoService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
	
    @GetMapping("/aluno/cadastro")
    public String telaCadastrarAluno(Model model) {
        Aluno aluno = new Aluno();
        model.addAttribute("aluno", aluno);
        return "/aluno/cadastro";
    }
    
    @PostMapping("/aluno/cadastrar")
    public String cadastrarAluno(Model model, Aluno aluno) throws SQLException {
    	alunoService.incluirAluno(aluno);
        return "redirect:/aluno/lista";
    }
    
    @GetMapping("/aluno/lista")
    public String consultarAluno(Model model) {
    	model.addAttribute("lista", alunoService.consultar());
        return "/aluno/lista";
    }
    
    @GetMapping("/aluno/excluir")
    public String excluirAluno(@RequestParam int id) {
    	alunoService.excluir(id);
        return "redirect:/aluno/lista";
    }
    
    @GetMapping("/aluno/alterar")
    public ModelAndView alterarAluno(@RequestParam int id) {  
        ModelAndView mav = new ModelAndView("/aluno/alterar");
        Aluno aluno = alunoService.consultarPorID(id);
        mav.addObject("aluno", aluno);
        return mav;
    }
    
    @PostMapping(value = "/aluno/salvaraluno")
    public String salvarAluno(@ModelAttribute("aluno") Aluno aluno) {
    	alunoService.incluirAluno(aluno);
        return "redirect:/aluno/lista";
    }
    
    @GetMapping("/aluno/procura")
    public ModelAndView pesquisarAluno(@RequestParam String keyword) {
        List<Aluno> result = alunoService.procura(keyword);
        ModelAndView mav = new ModelAndView("/aluno/procura");
        mav.addObject("result", result);
        return mav;
    }
}
