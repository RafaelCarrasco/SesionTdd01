package cl.ubb.agil;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.calculadora;

public class calculadoraTest {
	private calculadora cal;

	@Before
	public void setup(){
		cal=new calculadora();
	}

	// test N�1
	@Test
	public void DosMasTresEsCinco() {
		//calculadora cal = new calculadora();
		int resultado = cal.suma(2, 3);
		assertThat(resultado, is(5));
	}

	// test N�2
	@Test
	public void SumaMenosUnoYSieteEsSeis() {
		//calculadora cal = new calculadora();
		int resultado = cal.suma(-1, 7);
		assertThat(resultado, is(6));
	}

	// test N�3
	@Test
	public void RestaDocientoYSeteitaYTresEsCientoVentiYSiete() {
		//calculadora cal = new calculadora();
		int resultado = cal.resta(200, 73);
		assertThat(resultado, is(127));
	}

	// test N�4
	@Test
	public void RestaMenosDiezYCincoEsMenosQuince() {
		//calculadora cal = new calculadora();
		int resultado = cal.resta(-10, 5);
		assertThat(resultado, is(-15));
	}

	// test N�5
	@Test
	public void MultiplicacionSeisYTres() {
		int resultado = cal.multiplicacion(6,3);
		assertThat(resultado, is(18));
	}
}
