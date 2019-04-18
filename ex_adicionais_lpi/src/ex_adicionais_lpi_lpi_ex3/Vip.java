package ex_adicionais_lpi_lpi_ex3;

public class Vip extends Ingresso{
	Ingresso ingresso = new Ingresso();
	private double valor = ingresso.getValor() + (ingresso.getValor()*0.2);
	
	public void ImprimeValor() {
	System.out.println("ingresso vip no valor de :" + valor);
	}

}
