package br.com.universidade.entidade;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
public class Boleto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoBoleto;
	
	@NotNull(message="Informe o valor")
	private Double valor;
	
	public Integer getCodigoBoleto() {
		return codigoBoleto;
	}

	public void setCodigoBoleto(Integer codigoBoleto) {
		this.codigoBoleto = codigoBoleto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	
	@Temporal(TemporalType.DATE)
	@NotNull(message="Informe o vencimento")
	private Date vencimento;
	
	private Double valorPago;
	private Date dataPagamento;
	
	@ManyToOne
	@JoinColumn(name="matricula")
	@NotNull(message="Informe o aluno")
	private Aluno aluno;
	
}
