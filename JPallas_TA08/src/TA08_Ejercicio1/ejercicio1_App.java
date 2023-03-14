package TA08_Ejercicio1;

public class ejercicio1_App {

	public static void main(String[] args) {
		
		// Creo persona 1
		Persona persona1 = new Persona("87654321B");
		System.out.println(persona1);

		// Creo persona 2
		Persona persona2 = new Persona("Josep", 29, "77791527F", "H");
		System.out.println(persona2);

		// Creo persona 3
		Persona persona3 = new Persona("Marta", 21, "12345678A", "M", 52, 164);
		System.out.println(persona3);

		// Modifico persona 3
		persona3.setNombre("Carmen");
		System.out.println(persona3);
		
		// Compruebo genero por defecto
		Persona persona4 = new Persona("Sergio", 32, "87654321B", "Z");
		System.out.println(persona4);

	}

}
