package ec.demos;

public class OperacionesApp {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora ();
		
		calculadora.setValue1(50);
		calculadora.setValue2(83);
		calculadora.sumar();
	
		calculadora.setValue1(20);
		calculadora.setValue2(5);
		calculadora.restar();
		
	

		calculadora.setValue1(12);
		calculadora.setValue2(15);
		calculadora.modulo();
		
		
	}

}
