package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import cl.ubb.agil.calculadora;

public class calculadoraTest {
	
	@Test
	public void DosMasTresEsCinco(){
		calculadora cal=new calculadora();
		int resultado = cal.suma(2, 3);
		assertThat(resultado,is(5));
	}
	
	@Test
	public void SumaMenosUnoYSieteEsSeis(){
		calculadora cal=new calculadora();
		int resultado = cal.suma(-1, 7);
		assertThat(resultado,is(6));
	}

}
