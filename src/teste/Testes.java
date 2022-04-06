package teste;

import junit.framework.TestCase;
import objetos.Aluguel;

public class Testes extends TestCase{
	Aluguel tstA = new Aluguel();
	public void testValidaData() {		
		int dia = 29;
		int mes = 2;
		int ano = 2022;
		
		int dia2 = 31;
		int mes2 = 5;
		int ano2 = 2021;
		
		boolean valorEsperado = false;
		boolean valorEncontrado = tstA.validaData(dia,mes,ano);
		assertEquals(valorEsperado, valorEncontrado);
		
		boolean valorEsperado2 = true;
		boolean valorEncontrado2 = tstA.validaData(dia2,mes2,ano2);
		assertEquals(valorEsperado2, valorEncontrado2);
	}
}
