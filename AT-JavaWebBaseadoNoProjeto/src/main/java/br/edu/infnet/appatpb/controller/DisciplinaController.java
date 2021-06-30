package br.edu.infnet.appatpb.controller;

import br.edu.infnet.appatpb.model.negocio.Aluno;
import br.edu.infnet.appatpb.model.negocio.Disciplina;
import br.edu.infnet.appatpb.model.service.AlunoService;
import br.edu.infnet.appatpb.model.service.DisciplinaService;
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
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @Autowired
    private AlunoService alunoService;
	
    @GetMapping("/disciplina/cadastro")
    public String telaCadastraDisciplina(Model model) {
        Disciplina disciplina = new Disciplina();      
        model.addAttribute("disciplina", disciplina);
        model.addAttribute("alunos", alunoService.consultar());
        return "disciplina/cadastro";      
    }
    
    @PostMapping("/disciplina/cadastrar")
    public String cadastrarDisciplina(Model model, Disciplina disciplina, Aluno aluno, Integer id) throws SQLException {
    	disciplinaService.incluirDisciplinaLista(disciplina, aluno);
        return "redirect:/disciplina/lista";
    }
    
    @GetMapping("/disciplina/lista")
    public String listaDisciplina(Model model) {
    	model.addAttribute("listaDisciplina", disciplinaService.consultar());
        return "/disciplina/lista";
    }
    
    @GetMapping("/disciplina/excluir")
    public String excluirDisciplina(@RequestParam int id, Model model) {
        try{
           disciplinaService.excluir(id);
        } catch(Exception e) {
            model.addAttribute("permissao", "Disciplina atrelada ao aluno.");
            
            return listaDisciplina(model);
        }
        
        return "redirect:/disciplina/lista";
    }
    
    @GetMapping("/disciplina/alterar")
    public ModelAndView alterarDisciplina(@RequestParam int id) {    
        ModelAndView mav = new ModelAndView("/disciplina/alterar");
        Disciplina disciplina = disciplinaService.consultarPorID(id);
        mav.addObject("disciplina", disciplina);
        return mav;
    }
    
    @PostMapping(value = "/disciplina/salvardisciplina")
    public String salvarDisciplina(@ModelAttribute("disciplina") Disciplina disciplina) {
    	disciplinaService.cadastrarDisciplina(disciplina);
        return "redirect:/disciplina/lista";
    }
    
    @GetMapping("/disciplina/procura")
    public ModelAndView pesquisaDisciplina(@RequestParam String keyword) {
        List<Disciplina> result = disciplinaService.procura(keyword);
        ModelAndView mav = new ModelAndView("/disciplina/procura");
        mav.addObject("result", result);
        return mav;
    }
}
