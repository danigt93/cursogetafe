package es.curso.java.introduccion;

public class Operadores {
	public static void main(String [] args) {
		System.out.println();
		//Aritmeticos
		int num = 0;
		num++;//este le esta sumando 1 y dependiendo donde esté el signo de suma, si esta a la izq(le cambia el valor y luego lo usa) y a la derch(primero usa uno y despues le cambia el valor)
		System.out.println(num++);// aqui ya vale 2, pero solo te imprime un "1" porque SOLO hay una orden de impresion en pantalla
		System.out.println(num);// aqui es 2 ya que hay una orden de imprimir en pantalla (se imprime 2 que es el valor de la linea de antes)
		
		System.out.println(num+=5);
		
		//Operador mod
		boolean esPar = (num%2)==0;// se utiliza para comparar los 2 signos "=="
		int resultado = 7*3;
		System.out.println(esPar);
		
	//Condicionales //TODOS LOS CONDICIONALES NOS DEVUELVEN UN BOOLEANO
		boolean esMayor = 7 > (num%2);//¿ 7 es mayor que "num" dividido entre 2? no, porque el valor no lo superan
		
		//Logicos
		int num2 = 8;
		System.out.println(num2>=7 && num2>2 || num2>3);// && significa "esto y esto", y || significa "o"
						   //true    //true    //false
		System.out.println(num2>=8 || (num2<2 || num2>3));
						  //true  como num ya es verdadero lo demas NO te lo evalua aunque se ejecute
		
	}
}
