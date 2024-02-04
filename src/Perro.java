
public class Perro {
	private String nombre;
	private int edad;
	
	public Perro(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void saludar() {
		System.out.println("Hola, soy" + nombre +" y soy un perro");
	}
}
