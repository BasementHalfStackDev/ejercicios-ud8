package TA08_Ejercicio4;

public class Serie {

	// Atributos
	private String titulo;
	private int temporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructores
	public Serie() {
		this.titulo = "";
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.temporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int temporadas, String genero, String creador) {
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	// Getters
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", temporadas=" + temporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	// Setters
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

}
