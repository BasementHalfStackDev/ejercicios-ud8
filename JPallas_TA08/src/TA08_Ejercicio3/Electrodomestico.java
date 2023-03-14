package TA08_Ejercicio3;

public class Electrodomestico {

	// Constantes y valores por defecto
	private final String[] NIVELES_CONSUMO = { "A", "B", "C", "D", "E", "F" };
	private final String[] COLORES_DISPONIBLES = { "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS" };
	private final double PRECIO_DEFAULT = 100;
	private final String COLOR_DEFAULT = "BLANCO";
	private final String CONSUMO_DEFAULT = "F";
	private final int PESO_DEFAULT = 5;

	// Atributos
	private double precioBase;
	private String color;
	private String consumo;
	private int peso;

	// Constructores
	public Electrodomestico() {
		this.precioBase = PRECIO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
		this.peso = PESO_DEFAULT;
	}

	public Electrodomestico(double precio, int peso) {
		this.precioBase = precio;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
		this.peso = peso;
	}

	public Electrodomestico(double precio, String color, String consumo, int peso) {
		this.precioBase = precio;
		this.color = validarColor(color);
		this.consumo = validarConsumo(consumo);
		this.peso = peso;
	}

	// Getters
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}

	public double getPrecio() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public String getConsumo() {
		return consumo;
	}

	public int getPeso() {
		return peso;
	}

	// Setters
	public void setPrecio(double precio) {
		this.precioBase = precio;
	}

	public void setColor(String color) {
		this.color = validarColor(color);
	}

	public void setConsumo(String consumo) {
		this.consumo = validarConsumo(consumo);
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	// Validadores
	public String validarColor(String color) {
		color = color.toUpperCase();
		for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {
			if (color.equals(COLORES_DISPONIBLES[i])) {
				return color;
			}
		}
		System.out.println(
				"Ha ocurrido un error. El color introducido no es valido. Se ha agregado el color por defecto.");
		return COLOR_DEFAULT;
	}

	public String validarConsumo(String consumo) {
		consumo = consumo.toUpperCase();
		for (int i = 0; i < NIVELES_CONSUMO.length; i++) {
			if (consumo.equals(NIVELES_CONSUMO[i])) {
				return consumo;
			}
		}
		System.out.println(
				"Ha ocurrido un error. El consumo introducido no es valido. Se ha agregado el consumo por defecto");
		return CONSUMO_DEFAULT;
	}

}
