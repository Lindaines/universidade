package br.com.universidade.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;



@Entity
public class Turma {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTurma;
	
	@NotNull(message="Informe o nome da turma")
	private String nome;
	

	@JoinColumn(name="idCurso")
	@NotNull(message="Informe o curso")
	private Curso curso;
	
	@ManyToMany
	@JoinTable(name="AlunoTurma",
		joinColumns = @JoinColumn(name="idTurma"), 
		inverseJoinColumns = @JoinColumn(name="idAluno"))
	private List<Aluno> alunos;
	
	@ManyToMany
	@JoinTable(name="idTurma",
		joinColumns = @JoinColumn(name="idTurma"), 
		inverseJoinColumns = @JoinColumn(name="idHorario"))
	private List<Horario> horario;

	public Integer getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Horario> getHorario() {
		return horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
	}
	

}
