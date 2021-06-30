package br.edu.infnet.appatpb.model.negocio;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
public class Aluno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_aluno")
    private int id;
    
    private String nomeAluno;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "alunos_disciplinas", 
        joinColumns = { @JoinColumn(name = "id_aluno") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_disciplina") }
    )
    
    Set<Disciplina> disciplinas = new HashSet<>();
    public void setDisciplinas(Set<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Aluno() {
    }
    
    public Aluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }    

    public Set<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    @Override
    public String toString() {
        return id + " " + nomeAluno;
    }
}