package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		LambdaExpression lambda = new LambdaExpression();
		lambda.ordenar();		
		lambda.ordernarLambda();
		lambda.calcular();
		lambda.calcularLambda();

	}
	
	public void ordenar(){
		List<String> lista =  new ArrayList<>();
		lista.add("Test");
		lista.add("Code");
		lista.add("Java");
		
		//Enfoque imperativo, more verbosity
		Collections.sort(lista,new Comparator<String>(){
			public int compare(String o1,String o2){
				return o1.compareTo(o2);
			}
		});
		System.out.println(lista);
		
	}
	
	public void calcular(){
		Operacion op = new Operacion(){
			@Override
			public double calcularPromedio(double n1, double n2) {
				return (n1+n2) / 2;
			}			
		};
		
		System.out.println(op.calcularPromedio(5, 3));	
		
	}
	
	public void ordernarLambda(){
		List<String> lista =  new ArrayList<>();
		lista.add("Test");
		lista.add("Code");
		lista.add("Java");
		
		//Expresion lambda, comparar 2 parametros
		Collections.sort(lista, (String p1,String p2)-> p1.compareTo(p2));
		System.out.println(lista);
	}
	
	
	public void calcularLambda(){
		
		Operacion op = (double n1, double n2) -> (n1+n2)/2;
		System.out.println(op.calcularPromedio(8, 3));	
		
	}
	

}
