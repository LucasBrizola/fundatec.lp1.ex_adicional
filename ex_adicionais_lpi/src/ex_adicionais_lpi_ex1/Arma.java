package ex_adicionais_lpi_ex1;

public class Arma implements Item{
	String peso;
	String nome;
	int municao;
	
	void disparar() {
		System.out.println("disparando...");
	}
	void recarregar() {
		System.out.println("recarregando");
	}
	@Override
	public boolean quebrado() {
		System.out.println("vai mostrar se esta quebrado");
		return false;
	}
	@Override
	public boolean visivel() {
		System.out.println("vai mostrar se esta visivel");
		return false;
	}
}
