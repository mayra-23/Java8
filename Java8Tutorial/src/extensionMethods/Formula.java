package extensionMethods;

public interface Formula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
	
	default int getNumber(){
		return 5;
	}

}
