import java.util.ArrayList;

	public class AnalisisEdad {
		
		private ArrayList<Integer> numeros;

		/**
		 * @param numeros
		 */
		public AnalisisEdad(ArrayList<Integer> numeros) {
			super();
			this.numeros = numeros;
		}

		/**
		 * @return the numeros
		 */
		public ArrayList<Integer> getNumeros() {
			return numeros;
		}

		/**
		 * @param numeros the numeros to set
		 */
		public void setNumeros(ArrayList<Integer> numeros) {
			this.numeros = numeros;
		}
		
		public void contarEdades (ArrayList numeros) {
			int cantmenores = 0, cantmayores = 0, jubilados = 0, edad;
			
			for (int i=0;i<numeros.size();i++) {
				edad = (int) numeros.get(i);
				if (edad<18) {
					cantmenores++;
				}else if (edad>= 18 & edad<56) {
					cantmayores++;
				}else {
					jubilados++;
				}
			}
			
			System.out.println("La cantidad de menores es :"+cantmenores+" ,la cantidad de mayores es: "+cantmayores+" la cantidad de jubildados es:"+jubilados);
			
		}


	}


