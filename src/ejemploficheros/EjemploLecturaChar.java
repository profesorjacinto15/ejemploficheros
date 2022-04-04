package ejemploficheros;

import java.io.*;

public class EjemploLecturaChar {
	public static void main(String[] args) {
		String nombreArchivo = "//Users/jacinto/Documents/prueba/p2.txt";
			
		try {
			FileOutputStream fo = new FileOutputStream(nombreArchivo);
			PrintWriter pw = new PrintWriter(fo);
			pw.println("Escritura de prueba." + 5);
			pw.flush();
			pw.close();
			fo.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
