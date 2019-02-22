package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalcularMediaTest {

	
	static Operaciones o = null;
	static int operacionesRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		o = new Operaciones();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		operacionesRealizadas++;
		System.out.println("Ejecutando test "+ operacionesRealizadas);
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se ha ejecutado el test: "+operacionesRealizadas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Se han terminado de ejecutar todas las pruebas");
		o = new Operaciones();
	}
	
	@DisplayName("Test de Caja Negra Lista de notas vacia")
	@Test
	void probarCalcularMedia1() {
		double[] notas = new double[0];
		assertEquals(0.0, o.obtenerNotaMedia(notas)); 
	}
	
	@DisplayName("Test de Caja Negra Lista de notas nulo")
	@Test
	void probarCalcularMedia2() {
		double[] notas = null;
		assertEquals(0.0, o.obtenerNotaMedia(notas)); 
	}
	
	@DisplayName("Test de Caja Negra Lista de notas con un valor")
	@Test
	void probarCalcularMedia3() {
		double[] notas = new double[1];
		notas[0] = 5.5; 
		assertEquals(6, o.obtenerNotaMedia(notas)); 
	}
	
	@DisplayName("Test de Caja Negra Lista de notas con un valor fuera del rango")
	@Test
	void probarCalcularMedia4() {
		double[] notas = new double[1];
		notas[0] = 11; 
		assertEquals(0.0, o.obtenerNotaMedia(notas)); 
	}

	@DisplayName("Test de Caja Negra Lista de notas con varios valores")
	@Test
	void probarCalcularMedia5() {
		double[] notas = new double[5];
		notas[0] = 5.5;
		notas[1] = 7.5;
		notas[2] = 3.5;
		notas[3] = 9.5;
		notas[4] = 8.5;
		assertEquals(7.0, o.obtenerNotaMedia(notas)); 
	}

	
}
