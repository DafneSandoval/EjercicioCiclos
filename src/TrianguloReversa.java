
public class TrianguloReversa {

	public static void main(String[] args) {
		int filas = 6; 
        for (int f = filas; f >= 1; f--) {
        // ciclo de filas
            for (int columnas = 1; columnas <= f; columnas++) 
            {
            	// ciclo de columnas
            	
                System.out.print(" * ");
            }
            // Impresion de asteristicos
            System.out.println();
        }// for triangulo

	}// main

}// class ciclos triangulo invertido
