
import java.util.ArrayList;

/**
 * 
 * @author ik012982i9 - Mauricio Diaz Araneda
 * Clase que realiza una suma entre dos numeros, un metodo
 * que nos dice si a es mayor que b y un ArrayList de Integer
 * 
 */

public class Matematica {
	
	//Propiedades de la clase Matematica
	private Integer a;
	private Integer b;
	ArrayList<Integer> suma;
	private Integer resultado;

	/**
	 * 
	 * @return nos devuelve el valor del Integer a
	 */
	public Integer getA() {
		return a;
	}

	/**
	 * 
	 * @param a asignamos el valor al Integer a
	 */
	public void setA(Integer a) {
		this.a = a;
	}
	/**
	 * 
	 * @return nos devuelve el valor del Integer b
	 */
	public Integer getB() {
		return b;
	}
	/**
	 * 
	 * @param b asignamos el valor al Integer b
	 */
	public void setB(Integer b) {
		this.b = b;
	}

	public ArrayList<Integer> getSuma() {
		System.out.println(suma);
		return suma;
	}


	public void setSuma(ArrayList<Integer> suma) {
		this.suma = suma;
	}


	public void setResultado(Integer resultado) {
		this.resultado = resultado;
	}


	public int getResultado(Integer a, Integer b) {
		resultado = a + b;
		return resultado;
	}
/**
 * 
 * @param a numero Integer a
 * @param b numero Integer b
 * @return nos devuelve true si a es mayor que b y false si a es igual
 *  o menor que b
 */
	public boolean esMayor(Integer a, Integer b){
		
		if (a > b){
		return true;
		}else{
		return false;
		}

	}
	/**
	 * Este metodo nos permite realizar la suma entre dos Integer, 
	 * ademas saca por pantalla el resultado
	 * 
	 * @param a numero Integer a
	 * @param b numero Integer b
	 */
	public void realizarSuma(Integer a, Integer b){
		resultado = a + b;
		System.out.println(resultado);
	}



}
