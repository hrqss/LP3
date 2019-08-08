package br.edu.ifms.biblioteca.model;

public  class Livro extends Acervo {
	private String autores;
	private int anoPublicacao;
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public int getISBR() {
		return ISBR;
	}
	public void setISBR(int iSBR) {
		ISBR = iSBR;
	}
	private int volume;
	private int ISBR;

}
