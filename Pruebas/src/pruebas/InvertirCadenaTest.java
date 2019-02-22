package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InvertirCadenaTest {

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

	@DisplayName("Test de Caja Negra Valor Vacio")
	@Test
	void probarFuncioCadenaAlreves1() {
		assertEquals("", o.obtenerCadenaAlreves("")); 
	}
	
	@DisplayName("Test de Caja Negra Valor Nulo")
	@Test
	void probarFuncioCadenaAlreves2() {
		assertNull(o.obtenerCadenaAlreves(null)); 
	}
	
	@DisplayName("Test de Caja Negra Valor 1 caracter")
	@Test
	void probarFuncioCadenaAlreves3() {
		assertEquals("a", o.obtenerCadenaAlreves("a")); 
	}
	
	
	@DisplayName("Test de Caja Negra Valor Limite superior")
	@Test
	void probarFuncioCadenaAlreves4() {
		assertEquals("JIHGFEDCBA", o.obtenerCadenaAlreves("ABCDEFGHIJ")); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite superior + 1")
	@Test
	void probarFuncioCadenaAlreves5() {
		assertNull( o.obtenerCadenaAlreves("JIHGFEDCBAK")); 
	}
	
	
	
	

}
