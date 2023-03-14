package TA08_Ejercicio4;

public class ejercicio4_App {

	public static void main(String[] args) {

		// Creado objeto con constructor por defecto
		Serie s1 = new Serie();
		System.out.println(s1);
		
		// Creado objeto con constructor titulo + creador
		Serie s2 = new Serie("Los Simpsons", "Matt Groening");
		System.out.println(s2);
		
		// Creado objeto con constructor completo
		Serie s3 = new Serie("Breaking Bad", 5, "Accion", "Vince Gilligan");
		System.out.println(s3);
		
		// Modificado atributo del objeto
		s3.setGenero("Thriller");
		System.out.println(s3);

	}

}
