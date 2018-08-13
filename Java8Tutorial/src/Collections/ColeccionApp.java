package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {
	
	private List<String> lista;
	
	public static void main(String[] args) {
		
		ColeccionApp app =  new ColeccionApp();
		app.llenarLista();
		app.usarForEach();
		System.out.println("************************************");
		app.usarRemoveIf();
		app.usarSort();
		app.usarForEach();
		
	}
	
	public void llenarLista(){
		lista = new ArrayList<String>();
		lista.add("Mayra");
		lista.add("David");
		lista.add("Carmen");
		
	}
	
	public void usarForEach(){
		//Traditional way
		/*for(String cad : lista){
			System.out.println(cad);			
		}*/
		

		//Método foreach pide un consumer
		//Consumer es una interfax funcional, que tiene único método abstracto accept de tipo void
		
		//lambdas
		//lista.forEach(x -> System.out.println(x));
		
		//Reference methods
		lista.forEach(System.out::println);
		
	}
	
	public void usarRemoveIf(){
		
		//Remove element If condition
		
		//Traditional way, Iterator
	/*	Iterator<String> it = lista.iterator();
		
		while(it.hasNext()){
			if(it.next().equalsIgnoreCase("david")){
				it.remove();
			}
		}*/
		
		
		//removeIf method + Lambda
		lista.removeIf(x -> x.equalsIgnoreCase("david"));			
	}
	
	public void usarSort(){
		//Collections.sort(lista);
		
		//Lambda
		lista.sort((x,y)-> x.compareTo(y));
	}

}
