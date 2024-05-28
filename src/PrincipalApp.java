import java.util.ArrayList;

public class PrincipalApp {

	public static void main(String[] args) {
		
		ArrayList<Integer>edades = new ArrayList<Integer>();
		
		edades.add(54);
		edades.add(25);
		edades.add(10);
		edades.add(889);
		edades.add(30);
		edades.add(2);
		edades.add(4);
		edades.add(19);
		edades.add(30);

		
		
		AnalisisEdad analisis = new AnalisisEdad (edades);
		
		System.out.println(edades);
		analisis.contarEdades(edades);		

	}

}
