package ex_adicionais_lpi_lpi_ex3;

public class CamaroteInferior extends Vip{
	Vip vip = new Vip();
	private String localizacao;
	private double valor = vip.getValor() + (vip.getValor()*0.25);

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	public void imprimirLocalizacao() {
		System.out.println("o camarote se encontra no local + " + localizacao);
	}
	
	public void ImprimeValor() {
	System.out.println("Ingresso Normal no valor de: " + valor);
	}
	
}
