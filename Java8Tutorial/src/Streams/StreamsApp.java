package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsApp {
	
	private List<String> lista;
	private List<String> numeros;
	
	public StreamsApp(){
		lista = new ArrayList<>();
		lista.add("Java");
		lista.add("Python");
		lista.add("JavaScript");
		lista.add("Ruby");
		
		numeros =  new ArrayList<>();
		numeros.add("1");
		numeros.add("2");
		numeros.add("3");
		numeros.add("4");
		numeros.add("5");		
	}
	
	public static void main(String[] args) {
		StreamsApp app = new StreamsApp();
		app.filtrar();
		app.ordenar();
		app.transformar();
		app.limitar();
		app.contar();
		
	}
	
	public void filtrar(){
		//Traditional way
	/*	for(String str : lista){
			if(str.startsWith("J")){
				System.out.println(str);
			}				
		}*/
		
		System.out.println("************* Filtrar *******************");
		//Streams
		lista.stream()//returns stream using lista as Source
		.filter(x -> x.startsWith("J")) //eliminates elements based on criteria
		.forEach(System.out::println); //iterates each element of the stream		
	}
	
	public void ordenar(){
		System.out.println("************* Ordenar ascendente (Orden natural) *******************");
		lista.stream()
		.sorted()
		.forEach(x -> System.out.println(x));
		
		
		System.out.println("************* Ordenar descendente *******************");
		lista.stream()
		.sorted((x,y)-> y.compareTo(x)) //Sort the stream
		.forEach(x -> System.out.println(x));		
	}
	
	public void transformar(){
		System.out.println("************* Convertir a Mayusculas *******************");
		lista.stream()
		//.map(x->x.toUpperCase())//cada elemento va a ser transformado con lo que se indique en map
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
		
		System.out.println("************* Convertir a cuadrado *******************");
		
		/*Traditional way
		 * for(String num:numeros){
			System.out.println(Integer.parseInt(num)*Integer.parseInt(num));
		}*/
				
		numeros.stream()
		.map(i -> Integer.parseInt(i)*Integer.parseInt(i))
		.forEach(System.out::println);
		
	}
	
	public void limitar(){
		
		System.out.println("************* Limitar el Stream a 2 *******************");
		lista.stream()
		.limit(2)//used to reduce the size of the stream
		.forEach(System.out::println);
	}
	
	public void contar(){
		System.out.println("Elementos en la lista original "+lista.stream().count()); //Contar elementos en la lista
	}
	
	

}
