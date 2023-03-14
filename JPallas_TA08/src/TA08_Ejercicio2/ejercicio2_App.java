package TA08_Ejercicio2;

public class ejercicio2_App {

	public static void main(String[] args) {
		Password pass1 = new Password("asdsads");
		Password pass2 = new Password(15);
		Password pass3 = new Password("1234abcd");

		System.out.println("Contraseña 1 es: " + pass1.getContraseña() + " con " + pass1.getLongitud()
				+ " Caracteres de longitud.");
		System.out.println("Contraseña 2 es: " + pass2.getContraseña() + " con " + pass2.getLongitud()
		+ " Caracteres de longitud.");
		System.out.println("Contraseña 3 es: " + pass3.getContraseña() + " con " + pass3.getLongitud()
		+ " Caracteres de longitud.");

	}

}
