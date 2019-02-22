package pruebas;

import java.util.ArrayList;

public class Operaciones {

	public Operaciones() {
		
	}

	
	public int sumar(int numero1,int numero2) {
		return numero1 + numero2;
	}
	

	public int sumarEdadesAdultas(int edad1,int edad2){
		
		int resultado = 0;
		if(	edad1 >=18 && edad1 <= 122 
			&& edad2 >=18 && edad2 <=122	
				) {
			resultado = edad1 + edad2;
		}
		return resultado;
	
	}
	
	public boolean esNumeroPar(int numero){
		return numero %2 == 0;
	}
	
	public boolean esNumeroImpar(int numero){
		return numero %2 != 0;
	}
	
	public int multiplicarNumeroParImpar(int numeroPar,int numeroImpar) {
		
		int resultado = 0;
		
		if(numeroPar != 0 && numeroImpar != 0) {
			
			if(this.esNumeroPar(numeroPar) && this.esNumeroImpar(numeroImpar)) {
				resultado = numeroPar * numeroImpar;
			}
			
		}
		return resultado;
	}
	
	public String obtenerCadenaAlreves(String cadena) {
		String cadenaInvertida = null;
		if(cadena != null) {
			if(cadena.length() <= 10) {
				if(cadena !="") {
					for (int x=cadena.length()-1;x>=0;x--) {
			    		cadenaInvertida += cadena.charAt(x);
				 	}
				}else {
					cadenaInvertida = "";
				}
			}else {
				cadenaInvertida = null;
			}
		}
		return cadenaInvertida;
	}
	
	
	public double obtenerNotaMedia(double[] notas) {
		double resultado = 0;
		double sumaNotas = 0;
		
		if(notas != null) {
			for (int i = 0; i < notas.length; i++) {
				double nota = notas[i];
				if(nota >= 0.0 && nota <=10.0) {
					 sumaNotas += notas[i];    
				}else {
					sumaNotas += 0.0;
				}
		    }
			
			if(sumaNotas > 0) {
				resultado = Math.ceil(sumaNotas / notas.length); 
			}
		}
		
		return resultado;
	}
	
	
	
	 /* @param String alumnos = [alumno1, alumno2, alumno3]
	  * 
	  * @ param double[] notas =	[nota1T,  nota1T,  nota1T,]
	  * 							[nota2T,  nota2T,  nota2T,]
	  * 							[nota3T,  nota3T,  nota3T,]
	  */
	public String[] obtenerAlumnosAprobados(String[] alumnos, double notas[][]) {
		String[] alumnosAprobados = null; 
		int numAlumnosAprobados = 0;
		if(alumnos != null && notas != null) {
			alumnosAprobados = new String[alumnos.length];
			for (int i = 0; i < alumnos.length; i++) {
				double[] notasAlumno = notas[i];
				double media = this.obtenerNotaMedia(notasAlumno);
				if(media >= 5) {
					alumnosAprobados[numAlumnosAprobados] = alumnos[i];
					numAlumnosAprobados++;
				}
		    }
		}
		
		return alumnosAprobados;
	}
	
	
}
