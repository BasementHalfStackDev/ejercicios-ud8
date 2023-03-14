package TA08_Ejercicio2;

import java.util.Random;

public class Password {

	private final static int LONGITUD = 8;

	private String contraseña;
	private int longitud;

	public Password(String contraseña) {
		this.contraseña = validatePass(contraseña);
		this.longitud = LONGITUD;
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generadorPass(longitud);
	}

	// Getters

	public String getContraseña() {
		return contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	// Setters
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// Funcion para agregar contraseña
	private static String validatePass(String pass) {
		if (pass.length() != LONGITUD) {
			System.out.println("Contraseña introducida incorrecta");
			System.out.println("Generando contraseña automaticamente...");
			return pass=generadorPass(LONGITUD);
		}
		return pass;
	}

	// Generador de contraseña aleatoria con los caracteres predefinidos
	private static String generadorPass(int n) {
		String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*_=+-/";
		char[] pass = new char[n];
		Random randchar = new Random();

		for (int i = 0; i < n; i++) {
			pass[i] = caracteres.charAt(randchar.nextInt(caracteres.length()));
		}

		return new String(pass);
	}

}
