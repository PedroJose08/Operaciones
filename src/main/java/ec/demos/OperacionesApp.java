package ec.demos;

public class OperacionesApp {

	public static void main(String[] args) {
		Operaciones operaciones = new Operaciones ();
		operaciones.setValue1(50);
		operaciones.setValue2(83);
		operaciones.sumar();

		OperResta oper = new OperResta();
		oper.setValue3(20);
		oper.setValue4(5);
		oper.restar();
		
	}

}
