package ex_adicionais_lpi_lpi_ex2;

import org.junit.Test;

import junit.framework.Assert;



public class PessoaTest {
	@Test
	public void deveCriarEinstein() {
		Pessoa einstein = new Pessoa("Einstein");
		einstein.ajustaDataDeNascimento(14, 3, 1879);
		Pessoa newton = new Pessoa("Newton");
		newton.ajustaDataDeNascimento(4, 1, 1643);
		Pessoa lucas = new Pessoa("Lucas");
		lucas.ajustaDataDeNascimento(10, 12, 1991);
		
		lucas.calculaIdade(lucas.getDia(), lucas.getMes(), lucas.getAno());
		einstein.calculaIdade(einstein.getDia(), einstein.getMes(), einstein.getAno());
		newton.calculaIdade(newton.getDia(), newton.getMes(), newton.getAno());
		
		Assert.assertEquals("Lucas", lucas.getNome());
		Assert.assertEquals(27,lucas.getIdade());
		
		Assert.assertEquals("Einstein", einstein.getNome());
		Assert.assertEquals(140,einstein.getIdade());
		
		Assert.assertEquals("Newton", newton.getNome());
		Assert.assertEquals(376,newton.getIdade());
	}
}
