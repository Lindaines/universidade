package br.com.universidade.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
public class Horario {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NotNull
	private Integer idHorario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	private Date horarioAula;
	
	@NotNull
	private String diaSemana;
	
	@ManyToMany
	@JoinTable(name="idHorario",
		joinColumns = @JoinColumn(name="idHorario"), 
		inverseJoinColumns = @JoinColumn(name="idTurma"))
	private List<Turma> turma;

	public Integer getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(Integer idHorario) {
		this.idHorario = idHorario;
	}

	public Date getHorarioAula() {
		return horarioAula;
	}

	public void setHorarioAula(Date horarioAula) {
		this.horarioAula = horarioAula;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	public List<Turma> getTurma() {
		return turma;
	}

	public void setTurma(List<Turma> turma) {
		this.turma = turma;
	}
}
