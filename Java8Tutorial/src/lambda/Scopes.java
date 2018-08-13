package lambda;

public class Scopes {
	
	private static double attr1;
	private double attr2;
	
	public static void main(String[] args) {
		Scopes scope = new Scopes();
		System.out.println(scope.probarLocalVariable());
		System.out.println(scope.probarAttrStaticVar());
	}
	
	public double probarLocalVariable(){
		//variables locales pueden ser usadas en las lambdas pero no modificadas
		double n3 = 3;
		
		//Clase anonima
		Calculo op = new Calculo(){
			@Override
			public double calcular(double n1, double n2) {				
				return n1 + n2 + n3;
			}			
		};
		
		
		
		//Lambda
		Calculo opLambda = (x,y) -> (x+y+n3);
		
		return opLambda.calcular(1,2);		
	}
	
	public double probarAttrStaticVar(){
		
		//variables globales pueden ser usadas y modificadas en las lambdas
		Calculo calculo = (x,y) -> {
			attr1 = x + y;
			attr2 =  attr1;
			return attr2;
		};
		
		
		return calculo.calcular(4, 6);
	}

}
