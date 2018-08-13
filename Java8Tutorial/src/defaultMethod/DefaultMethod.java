package defaultMethod;

public class DefaultMethod implements PersonaA, PersonaB {
	
	public static void main(String[] args) {
		DefaultMethod defaultM = new DefaultMethod();
		defaultM.caminar();
		defaultM.hablar();
	}

	@Override
	public void caminar() {
		System.out.println("caminar - no es default method");
	}

	@Override
	public void hablar() {
		System.out.println("Hablar default method class");
	}

}
