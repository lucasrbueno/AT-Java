package br.edu.infnet.appatpb.model.service;

import br.edu.infnet.appatpb.model.negocio.Aluno;
import br.edu.infnet.appatpb.model.repository.IAlunoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    private IAlunoRepository alunoRepository;

    public void incluir(Aluno aluno){
        alunoRepository.save(aluno);
    }

    public List<Aluno> consultar(){
        return (List<Aluno>) alunoRepository.findAll();
    }

    public Aluno consultarPorID(Integer id){
        return alunoRepository.findById(id).get();
    }

    public void excluir(Integer id){
        alunoRepository.deleteById(id);
    }

    public List<Aluno> procura(String keyword){
        return alunoRepository.search(keyword);
    }
}