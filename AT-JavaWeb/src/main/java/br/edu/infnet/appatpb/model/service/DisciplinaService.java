package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Aluno;
import br.edu.infnet.appatpb.model.negocio.Disciplina;
import br.edu.infnet.appatpb.model.repository.IDisciplinaRepository;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaService {

    @Autowired
    private IDisciplinaRepository disciplinaRepository; 

    public void incluirDisciplinaLista(Disciplina disciplina, Aluno aluno){	
        Set<Disciplina> disciplinas = new HashSet<>();
        disciplinas.add(disciplina);
        aluno.setDisciplinas(disciplinas);
        disciplinaRepository.save(disciplina);
    }

    public void cadastrarDisciplina(Disciplina disciplina){	
        disciplinaRepository.save(disciplina);
    }

    public List<Disciplina> consultar(){
        return (List<Disciplina>) disciplinaRepository.findAll();
    }

    public Disciplina consultarPorID(Integer id){
        return disciplinaRepository.findById(id).get();
    }

    public void excluir(Integer id){
        disciplinaRepository.deleteById(id); 

    }

    public List<Disciplina> procura(String keyword){
        return disciplinaRepository.search(keyword);
    }
}
