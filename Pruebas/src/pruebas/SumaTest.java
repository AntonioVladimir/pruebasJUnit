package pruebas;
import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SumaTest {
	
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
	
	
	@DisplayName("Ejemplo de Test de Suma 1")
	@Test
	void sumarTest1() {
        assertEquals(10, o.sumar(6,4)); //Test Correcto
	}
	
	@DisplayName("Ejemplo de Test de Suma 2")
	@Test
    void sumarTest2(){
        assertEquals(12, o.sumar(6,6)); // Test Correcto
    }
	
	@DisplayName("Ejemplo de Test de Suma 3 Erroneo")
	@Test
    void sumarTes3(){
        assertEquals(15, o.sumar(10,2)); // Test Erroneo
    }
	
	@DisplayName("Ejemplo de Test de Suma 4")
	@Test
    void sumarTes4(){
        assertNotEquals(15, o.sumar(10,2)); // Test Correcto
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
}
