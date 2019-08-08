package br.edu.ifms.biblioteca.model;

import java.time.LocalDate;

public class Emprestimo {
	private int id;
	private LocalDate dtRetirada;
	private int prazo;
	private Pessoa pessoa; // aluno ou funcionario
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDtRetirada() {
		return dtRetirada;
	}
	public void setDtRetirada(LocalDate dtRetirada) {
		this.dtRetirada = dtRetirada;
	}
	public int getPrazo() {
		return prazo;
	}
	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	

}


