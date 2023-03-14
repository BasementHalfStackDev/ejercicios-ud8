package TA08_Ejercicio1;

public class Persona {

	// Sexo por defecto
	private final String SEXO_PORDEFECTO = "H";

	private String nombre; // Nombre de la persona
	private int edad; // Edad
	private String DNI; // DNI
	private String sexo; // Sexo masculino o femenino
	private int peso; // Pero en kg
	private int altura; // Altura en cm

	// Constructores
	public Persona(String DNI) {
		this.nombre = "";
		this.edad = 0;
		this.DNI = this.validadorDNI(DNI);
		this.sexo = SEXO_PORDEFECTO;
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String DNI, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.validadorDNI(DNI);
		this.sexo = this.validadorSexo(sexo);
	}

	public Persona(String nombre, int edad, String DNI, String sexo, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.DNI = this.validadorDNI(DNI);
		this.sexo = this.validadorSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}

	// Getters

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDNI() {
		return DNI;
	}

	public String getSexo() {
		return sexo;
	}

	public int getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	// Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// Validadores
	public String validadorDNI(String dni) {
		if (dni.isEmpty()) {
			throw new IllegalArgumentException("Error, campo de DNI vacio.");
		}
		return dni;
	}

	public String validadorSexo(String sexo) {
		sexo = sexo.toUpperCase();
		if (!sexo.equals(SEXO_PORDEFECTO) && !sexo.equals("M")) {
			System.out.println("Error, sexo introducido incorrecto. Aplicando hombre por defecto");
			return SEXO_PORDEFECTO;
		}
		return sexo;
	}

}
