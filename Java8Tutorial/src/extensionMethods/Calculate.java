package extensionMethods;

public class Calculate {

	public static void main(String[] args) {
		Formula formula = new Formula(){
			@Override
			public double calculate(int a) {
				return a+6;
			}
		};
		
		double num = formula.calculate(8);		
		double raiz =  formula.sqrt((int)num);
		System.out.println(raiz);

	}

}
