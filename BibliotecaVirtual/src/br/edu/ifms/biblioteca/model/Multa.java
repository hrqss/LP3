package br.edu.ifms.biblioteca.model;

import java.time.LocalDate;

public class Multa {
	private int id;
	private int idEmprestimo;
	private LocalDate dtDevolucao;
	private LocalDate valor; //nova data para fazer emprestimo
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdEmprestimo() {
		return idEmprestimo;
	}
	public void setIdEmprestimo(int idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}
	public LocalDate getDtDevolucao() {
		return dtDevolucao;
	}
	public void setDtDevolucao(LocalDate dtDevolucao) {
		this.dtDevolucao = dtDevolucao;
	}
	public LocalDate getValor() {
		return valor;
	}
	public void setValor(LocalDate valor) {
		this.valor = valor;
	}
	
	

}
