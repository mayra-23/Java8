package functInterface;

public class FunctionalTest{

	public static void main(String[] args) {
		FunctionalTest ft = new FunctionalTest();
		ft.test();
	}
	
	public void test(){
		Functional f = () -> "hola";
		System.out.println(f.functionalMethod());
	}
}
