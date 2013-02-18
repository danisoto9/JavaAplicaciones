
public class Test {

	public static void main(String[] args) {
		pajaro p;
		p=new pajaro();
		p.setEdad(5);
		System.out.println("La edad es:");
		p.printEdad();
		
		//AÑDADIDO PARA HACER PRUEBAS
		p.setColor('b');
		System.out.println("El color es:");
		p.printColor();
		p.setEdad(10);
		System.out.println("La edad es:");
		p.printEdad();
		p.setTipo('l');
		System.out.println("El tipo de pajaro es:");
		p.printTipo();

	}

}
