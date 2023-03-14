package TA08_Ejercicio3;

public class ejercicio3_App {

	public static void main(String[] args) {

		// Crear objeto con constructor por defecto
		Electrodomestico obj1 = new Electrodomestico();
		System.out.println(obj1);

		// Crear objeto con precio y peso
		Electrodomestico obj2 = new Electrodomestico(39.99, 10);
		System.out.println(obj2);

		// Crear objeto con errores
		Electrodomestico obj3 = new Electrodomestico(50, "verde", "asdfsfa", 15);
		System.out.println(obj3);

		// Crear objetos con todos los campos
		Electrodomestico obj4 = new Electrodomestico(40, "negro", "B", 20);
		System.out.println(obj4);

		// Cambio de color a uno invalido
		obj4.setColor("verde");
		System.out.println(obj4);

		// Cambio de peso y devolver el color original
		obj4.setColor("negro");
		obj4.setPeso(15);
		System.out.println(obj4);

	}

}
