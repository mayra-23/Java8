package Optional;

import java.util.Optional;

public class OptionalApp {
	public static void main(String[] args) {
		
		OptionalApp app = new OptionalApp();
		app.probar(null);
		app.orElse(null);
		app.orElse("Holiiii");
		//app.orElseThrow(null);
		app.isPresent(null);
		app.isPresent("holoo");
	}
	
	public void probar(String valor){
		//System.out.println(valor.contains("hola"));
		
		try{
			Optional op =  Optional.empty();
			op.get();			
		}
		catch(Exception e){
			System.out.println("No hay elemento");
		}	
		
	}
	
	//Si el valor es nulo, define uno por default
	public void orElse(String valor){
		Optional<String> op = Optional.ofNullable(valor);
		String x = op.orElse("valor por default");
		System.out.println(x);
		
	}
	
	//Si el valor es nulo, envia la excepción que queramos
	public void orElseThrow(String val){
		Optional<String> opt = Optional.ofNullable(val); 
		opt.orElseThrow(NumberFormatException::new);
	}
	
	//true si el valor esta presente, false si el valor es null
	public void isPresent(String valor){
		Optional<String> op = Optional.ofNullable(valor);
		System.out.println(op.isPresent());
	}
	
	
	
}
