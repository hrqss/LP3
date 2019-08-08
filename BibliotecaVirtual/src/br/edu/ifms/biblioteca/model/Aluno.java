package br.edu.ifms.biblioteca.model;

import java.time.LocalDate;

public class Aluno extends Pessoa {
	private int RA;
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public LocalDate getDtEntrada() {
		return dtEntrada;
	}
	public void setDtEntrada(LocalDate dtEntrada) {
		this.dtEntrada = dtEntrada;
	}
	public LocalDate getDtSaida() {
		return dtSaida;
	}
	public void setDtSaida(LocalDate dtSaida) {
		this.dtSaida = dtSaida;
	}
	private LocalDate dtEntrada;
	private LocalDate dtSaida;

}
