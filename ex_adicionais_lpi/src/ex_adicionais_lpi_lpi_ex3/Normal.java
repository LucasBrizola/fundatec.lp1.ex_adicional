package ex_adicionais_lpi_lpi_ex3;

public class Normal extends Ingresso{
	Ingresso ingresso = new Ingresso();
	
	private double valor = ingresso.getValor();
	
	public void ImprimeValor(double valor) {
	System.out.println("Ingresso Normal no valor de: " + valor);
	}
}