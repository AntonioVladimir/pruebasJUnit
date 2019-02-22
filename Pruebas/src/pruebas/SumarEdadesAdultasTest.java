package pruebas;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumarEdadesAdultasTest {

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
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior")
	@Test
	void sumarEdadesAdultasTest1() {
        assertEquals(36, o.sumarEdadesAdultas(18,18)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Inferior -1")
	@Test
	void sumarEdadesAdultasTest2() {
        assertEquals(0, o.sumarEdadesAdultas(17,17)); 
	}
	
	@DisplayName("Test de Caja Negra Valor Limite Superior")
	@Test
	void sumarEdadesAdultasTest3() {
        assertEquals(244, o.sumarEdadesAdultas(122,122)); 
	}

	@DisplayName("Test de Caja Negra Valor Limite Superior + 1")
	@Test
	void sumarEdadesAdultasTest4() {
        assertEquals(0, o.sumarEdadesAdultas(123,123)); 
	}
	
	
	@DisplayName("Test de Caja Blanca Solo Primera Condicion correcta")
	@Test
	void sumarEdadesAdultasTest5() {
        assertEquals(0, o.sumarEdadesAdultas(125,1));
        assertNotEquals(126, o.sumarEdadesAdultas(125,1)); 
	}
	
	@DisplayName("Test de Caja Blanca Solo Segunda Condicion correcta")
	@Test
	void sumarEdadesAdultasTest6() {
        assertEquals(0, o.sumarEdadesAdultas(110,1));
        assertNotEquals(111, o.sumarEdadesAdultas(110,1));
	}
	
	
	@DisplayName("Test de Caja Blanca Solo Tercera Condicion correcta")
	@Test
	void sumarEdadesAdultasTest7() {
        assertEquals(0, o.sumarEdadesAdultas(190,130)); 
        assertNotEquals(320, o.sumarEdadesAdultas(190,130)); 
	}
	

	@DisplayName("Test de Caja Blanca Solo Cuarta Condicion correcta")
	@Test
	void sumarEdadesAdultasTest8() {
        assertEquals(0, o.sumarEdadesAdultas(170,2));
        assertNotEquals(172, o.sumarEdadesAdultas(170,2)); 
	}
	

	@DisplayName("Test de Caja Blanca Solo Primera, Segunda y Tercera Condicion correcta")
	@Test
	void sumarEdadesAdultasTest9() {
		assertEquals(0, o.sumarEdadesAdultas(70,130)); 
        assertNotEquals(200, o.sumarEdadesAdultas(70,130)); 
	}
	
	@DisplayName("Test de Caja Blanca Solo Primera, Segunda, Cuarta Condicion correcta")
	@Test
	void sumarEdadesAdultasTest10() {
		assertEquals(0, o.sumarEdadesAdultas(105,10)); 
        assertNotEquals(115, o.sumarEdadesAdultas(105,10)); 
	}
	
	@DisplayName("Test de Caja Blanca Solo Primera,Tercera y Cuarta Condicion correcta")
	@Test
	void sumarEdadesAdultasTest11() {
		assertEquals(0, o.sumarEdadesAdultas(130,30)); 
        assertNotEquals(160, o.sumarEdadesAdultas(130,30)); 
	}
	
	
	@DisplayName("Test de Caja Blanca Solo Segunda, Tercera y Cuarta Condicion correcta")
	@Test
	void sumarEdadesAdultasTest12() {
		assertEquals(0, o.sumarEdadesAdultas(15,40)); 
        assertNotEquals(55, o.sumarEdadesAdultas(15,40)); 
	}
	
	@DisplayName("Test de Caja Blanca Todos Correcto")
	@Test
	void sumarEdadesAdultasTest13() {
		assertEquals(140, o.sumarEdadesAdultas(90,50)); 
        assertNotEquals(0, o.sumarEdadesAdultas(90,50)); 
	}
	
	
	
	
	
}
