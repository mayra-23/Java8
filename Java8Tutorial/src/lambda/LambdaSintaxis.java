package lambda;

public class LambdaSintaxis {

	public static void main(String[] args) {
		LambdaSintaxis sintaxis = new LambdaSintaxis();
		System.out.println(sintaxis.probarSintaxis());
	}
	
	public double probarSintaxis(){
		//1		
		Operacion op = (double x, double y)->(x+y)/2;
		
		// 2 parametros -> entre llaves metodo o procesos a evaluar ************************************************
		//Operacion op = (double x, double y) -> {return (x+y)/2;};
		
		
		//3 Llaves se aconseja cuando se necesita definir más de una linea,pero no es recomendado ************************************************************	
		/*Operacion op = (double x, double y) -> {
			double a = 2;
			System.out.println(a);
			return ((x+y)/2) + a;
		};*/
		
		
		//4  Sin tipo de parametro ************************************************************************************
		//Operacion op = (x, y) -> (x+y)/2;
		
		
		//5 Para un método sin parametros ***************************************************************
		//Operacion op = () -> 10;
		
				
		//6 método sin parametros, implementando el método entre llaves *************************************************
		/*Operacion op = () -> {
			double x=2;
			double y=3;
			return (x+y)/2;
		};
		
		op.calcularPromedio();
		*/
		
		
		
		return op.calcularPromedio(5,7);
	}

}
