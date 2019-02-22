package pruebas;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ParImparTest {

	static Operaciones o = null;
	static int operacionesRealizadas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Preparando Tests");
		System.out.println("Valor más pequeño:"+Integer.MIN_VALUE);
		System.out.println("Valor más pequeño -1:"+(Integer.MIN_VALUE -1));
		System.out.println("Valor más grande:"+Integer.MAX_VALUE);
		System.out.println("Valor más grande +1:"+(Integer.MAX_VALUE + 1));
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

	
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	@Test
	void probarFuncioEsPar1() {
		assertTrue(o.esNumeroPar(Integer.MIN_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void probarFuncioEsPar2() {
		assertFalse( o.esNumeroPar(Integer.MIN_VALUE -1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior")
	@Test
	void probarFuncioEsPar3() {
		assertFalse(o.esNumeroPar(Integer.MAX_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void probarFuncioEsPar4() {
		assertTrue( o.esNumeroPar(Integer.MAX_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior -1")
	@Test
	void probarFuncioEsPar5() {
		assertTrue( o.esNumeroPar(Integer.MAX_VALUE - 1)); 
	}
	
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior +1")
	@Test
	void probarFuncioEsPar6() {
		assertFalse( o.esNumeroPar(Integer.MIN_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	@Test
	void probarFuncioEsImPar1() {
		assertTrue( o.esNumeroPar(Integer.MIN_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void probarFuncioEsImPar2() {
		assertTrue( o.esNumeroImpar(Integer.MIN_VALUE -1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior")
	@Test
	void probarFuncioEsImPar3() {
		assertTrue( o.esNumeroImpar(Integer.MAX_VALUE)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void probarFuncioEsImPar4() {
		assertFalse( o.esNumeroImpar(Integer.MAX_VALUE +1)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior -1")
	@Test
	void probarFuncioEsImPar5() {
		assertFalse( o.esNumeroImpar(Integer.MAX_VALUE - 1)); 
	}
	
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior +1")
	@Test
	void probarFuncioEsImPar6() {
		assertTrue( o.esNumeroImpar(Integer.MIN_VALUE +1)); 
	}
	
	
	
}
