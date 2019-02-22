package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ObtenerAlumnosAprobadosTest {

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
	
	@DisplayName("Test de Caja Negra lista de alumnos y notas vacia")
	@Test
	void probarObtenerAprobados1() {
		String[] resultadoEsperado = new String[0];
		assertArrayEquals(resultadoEsperado,o.obtenerAlumnosAprobados(new String[0], new double[0][0])); 
	}
	
	@DisplayName("Test de Caja Negra lista un alumno y sus notas")
	@Test
	void probarObtenerAprobados2() {
		String[] alumnos = new String[1];
		alumnos[0] = "Pepe";
		
		double[][] notas = new double[1][3]; 
		notas[0][0] = 5.0;
		notas[0][1] = 5.0;
		notas[0][2] = 5.0;
		
		String[] resultadoEsperado = new String[1];
		resultadoEsperado[0] = "Pepe";
		
		String[] resultadoObtenido = o.obtenerAlumnosAprobados(alumnos,notas);
		
		assertArrayEquals(resultadoEsperado, resultadoObtenido); 
	}
	
	
	@DisplayName("Test de Caja Negra lista con varios alumno y sus notas")
	@Test
	void probarObtenerAprobados3() {
		String[] alumnos = new String[3];
		alumnos[0] = "Pepe";
		alumnos[1] = "Rogelio";
		alumnos[2] = "Ana";
		
		double[][] notas = new double[3][3]; 
		
		notas[0][0] = 6.0;
		notas[0][1] = 6.0;
		notas[0][2] = 6.0;
		
		notas[1][0] = 3.0;
		notas[1][1] = 4.0;
		notas[1][2] = 2.0;
		
		notas[2][0] = 10.0;
		notas[2][1] = 10.0;
		notas[2][2] = 10.0;
		
		
		
		String[] resultadoEsperado = new String[3];
		resultadoEsperado[0] = "Pepe";
		resultadoEsperado[1] = "Ana";
		
		String[] resultadoObtenido = o.obtenerAlumnosAprobados(alumnos,notas);
		
		assertArrayEquals(resultadoEsperado, resultadoObtenido); 
	}
	
	
}
