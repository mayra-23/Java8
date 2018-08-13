package MethodReference;

import java.util.Arrays;
import java.util.Comparator;

public class MetRefApp {

	public static void main(String[] args) {
		MetRefApp app =  new MetRefApp();
		app.operar();
		app.referenciarMetodoInstanciaObjetoArbitrario();
		
		
		//método de instance del objeto particular app
		//referenciarMetodoInstanciaObjetoParticula método que implementa a saludar()
		Operacion op = app::referenciarMetodoInstanciaObjetoParticular;
		op.saludar();
		
		app.referenciarConstructor();
	}
	
	//static method
	public static void referenciarMetodoStatic(){
		System.out.println("Método referido static");
	}
	
	//
	public void referenciarMetodoInstanciaObjetoArbitrario(){
		String[] nombres = {"Mito","Code","Mayra"};
		
		//Without lambdas
		/*Arrays.sort(nombres, new Comparator<String>(){
			public int compare(String s1,String s2){
				return s1.compareToIgnoreCase(s2);
			}
		});*/
		
		//With lambdas
		//Arrays.sort(nombres,(s1,s2)->s1.compareToIgnoreCase(s2));
		
		//With reference methods
		//String es la clase que se va a comparar, se llama al metodo compareToIgnoreCase de la clase string
		Arrays.sort(nombres,String::compareToIgnoreCase);
		
		System.out.println("Instancia objeto arbitrario" + Arrays.toString(nombres));		
	}
	
	//
	public void referenciarMetodoInstanciaObjetoParticular(){
		System.out.println("Método referido instancia de objeto particular");		
	}
	
	//
	public void referenciarConstructor(){
		
	/*	IPersona ipersona = new IPersona(){
			public Persona crear(int id,String nombre){
				return new Persona(id,nombre);
			}
		};
		
		Persona persona = ipersona.crear(1, "Tradicional");
		System.out.println("Referencia constructor "+ persona.getId()+" - "+persona.getNombre());*/
		
		
		
		IPersona ipersona2 = (id,name)->(new Persona(id,name));
		Persona persona2 = ipersona2.crear(2, "Lambda");
		
		System.out.println("Referencia constructor: "+ persona2.getId()+" - "+persona2.getNombre());
		
		
		IPersona ipersona3 =  Persona::new;
		Persona persona3 = ipersona3.crear(3, "Reference method");
		
		System.out.println("Referencia constructor: "+ persona3.getId()+" - "+persona3.getNombre());
	}
	
	
	public void operar(){
		//Se pasa el método referenciarMetodoStatic como implementación de saludar
		
		//Lambdas
		Operacion op = () -> MetRefApp.referenciarMetodoStatic();
		op.saludar();
		
		
		//Lambdas +  método referencia
		//Clase :: método a llamar
		Operacion op2 = MetRefApp::referenciarMetodoStatic;
		op2.saludar();
	}
	
	

}
