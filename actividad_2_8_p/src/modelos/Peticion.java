package modelos;

public class Peticion {

		public static final int id=1;
		
		/**
		 * n representa al número de peticiones.
		 */
		private int n;
		
		/**
		 * Constructor que inicaliza n en 0
		 */
		public Peticion(){
			
			this.n=0;
		}


		public int getN() {
			return n;
		}


		public void setN(int n) {
			this.n = n;
		}
		
}
