import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMatematica {
	
	Matematica mat = new Matematica();
	
	@Test
	public void testAssertEquals(){
		Integer a = 3;
		Integer b = 3;
		mat.realizarSuma(a, b);
		Integer resultado = mat.getResultado(a, b);
		Integer esperado = 6;
		assertEquals(esperado, resultado);
 }
	@Test
	public void testIsTrue(){
		Integer a = 10;
		Integer b = 7;
		assertTrue(mat.esMayor(a, b));
	}
	
	@Test
	public void testIsFalse(){
		Integer a = 7;
		Integer b = 7;
		assertFalse(mat.esMayor(a, b));
	}
	@Test
	public void testNotNull(){
		Integer a = 4;
		Integer b = 5;
		Integer c = 10;
		mat.realizarSuma(a, b);
		mat.realizarSuma(b, c);
		Integer resultado = mat.getResultado(a, b);
		Integer resultado1 = mat.getResultado(b, c);
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		sumas.add(resultado);
		sumas.add(resultado1);
		mat.setSuma(sumas);
		assertNotNull(mat.getSuma());
	}
	@Test
	public void testNull(){
		Integer a = 4;
		Integer b = 5;
		mat.realizarSuma(a, b);
		Integer resultado = mat.getResultado(a,b);
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		sumas.add(resultado);
		mat.setSuma(sumas);
		assertNull(mat.getSuma());
	}
}
