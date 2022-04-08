package teste;

import junit.framework.TestCase;
import objetos.Aluguel;

public class Testes extends TestCase{
	Aluguel tstA = new Aluguel();
	public void testValidaData() {		
		int dia = 29;
		int mes = 2;
		int ano = 2020;
		
		
		int dia2 = 31;
		int mes2 = 5;
		int ano2 = 2021;
		
		boolean valorEsperado = true;
		boolean valorEncontrado = tstA.validaData(dia,mes,ano);
		assertEquals(valorEsperado, valorEncontrado);
		
		boolean valorEsperado2 = true;
		boolean valorEncontrado2 = tstA.validaData(dia2,mes2,ano2);
		assertEquals(valorEsperado2, valorEncontrado2);
	}
	
	public void testCalcularDiaria() throws Exception{
		

			double preco = 2.5;
			String d = "12/30/2022";
			String dia = "01/01/2023";
			
			
			double prec2 = 1;
			String d2 = "02/29/2020";
			String dia2 = "03/01/2020";
			
			double valorEsperado = 5;
			double valorEncontrado = tstA.calcular_Diaria(d, dia, preco);
			assertEquals(valorEsperado, valorEncontrado);
			
			double valorEsperado2 = 1;
			double valorEncontrado2 = tstA.calcular_Diaria(d2, dia2, prec2);
			assertEquals(valorEsperado2, valorEncontrado2);

	}
	
	public void testModifica() {		

		String d = "02/02/2022";
		
		int[] valorEsperado = {2,2,2022};
		int[] valorEncontrado = tstA.stringData(d);
		
		assertEquals(valorEsperado[1], valorEncontrado[1]);
		assertEquals(valorEsperado[0], valorEncontrado[0]);
		assertEquals(valorEsperado[2], valorEncontrado[2]);

	}
	
}
