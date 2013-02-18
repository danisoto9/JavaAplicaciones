
public class pajaro {
//***atributos o propiedades***	
	private char color; //propiedad o atributo color
	private int edad; //propiedad o atributo edad
	private char tipo;//propiedad o atributo nombre
	//**metodo de la clase***
	public void setEdad(int e){edad=e;}
	public void printEdad() {System.out.println(edad);}
	public void setColor (char c){color=c;}
	public void printColor (char c){color=c;}
	public void printColor(){
		switch (color){
		//los pajaros son verdes, amarillos, grises, negros o blancos
		//no existen pajaros de otros colores
		case 'v':System.out.println("verde");break;
		case 'a':System.out.println("amarillo");break;
		case 'g':System.out.println("gris");break;
		case 'n':System.out.println("negro");break;
		case 'b':System.out.println("blanco");break;
		default: System.out.println("color no establecido");break;
		
		}
	}
	public void setTipo(char t){tipo=t;}
	public void printTipo(char t) {tipo=t;}
	public void printTipo(){
		switch(tipo){
		case 'p':System.out.println("Periquito"); break;
		case 'l':System.out.println("Loro"); break;
		case 'P':System.out.println("Puput"); break;
		}
	}
}

