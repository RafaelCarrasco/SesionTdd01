package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import cl.ubb.agil.calculadora;

public class calculadoraTest {
	
	@Test
	public void DosMasTres(){
		calculadora cal=new calculadora();
		int resultado = cal.suma(2, 3);
		assertThat(resultado,is(5));
	}

}
