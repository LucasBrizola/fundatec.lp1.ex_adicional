package ex_adicionais_lpi_lpi_ex2;

public class Pessoa {
	private int idade;
	private int dia;
	private int mes;
	private int ano;
	private String nome;

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int calculaIdade(int dia, int mes, int ano) {
		int anoAtual = 2019;
		int mesAtual = 4;
		int diaAtual = 17;
		
		if (mes >= mesAtual && dia < diaAtual) {
			idade = (anoAtual - ano) -1;
		} else {
			idade = (anoAtual - ano);
		}
		return idade;
	}

	public int ajustaDataDeNascimento(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
		return idade;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

}
