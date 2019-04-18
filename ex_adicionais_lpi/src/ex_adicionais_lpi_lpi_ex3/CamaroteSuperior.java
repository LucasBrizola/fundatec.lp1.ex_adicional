package ex_adicionais_lpi_lpi_ex3;

public class CamaroteSuperior extends Vip {
	Vip vip = new Vip();
	private String localizacao;
	private double valor = vip.getValor() + (vip.getValor() * 0.5);

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void imprimirLocalizacao() {
		System.out.println("o camarote se encontra no local + " + localizacao);
	}

	public void imprimirValor() {
		System.out.println("o valor do ingresso é: " + valor);
	}

}
