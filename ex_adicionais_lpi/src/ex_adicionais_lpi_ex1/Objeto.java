package ex_adicionais_lpi_ex1;

public class Objeto implements Item{
	String peso;
	String nome;
	String cor;
	
	void largar() {
		System.out.println("largando objeto...");
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
