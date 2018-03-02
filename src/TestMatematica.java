import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestMatematica {
	
	Matematica mat = new Matematica();
	
	@Test
	public void testAssertEquals(){
		mat.realizarSuma(3, 3);
		Integer resultado = mat.getResultado();
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
		mat.realizarSuma(3, 4);
		Integer resultado = mat.getResultado();
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		assertNotNull(sumas.add(resultado));
	}
	@Test
	public void testNull(){
		mat.realizarSuma(3, 4);
		Integer resultado = mat.getResultado();
		ArrayList<Integer> sumas = new ArrayList<Integer>();
		assertNotNull(sumas.add(resultado));
	}
}
