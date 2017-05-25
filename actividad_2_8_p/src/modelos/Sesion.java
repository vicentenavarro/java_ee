package modelos;

public class Sesion {
		
		/**
		 * Identificador de la sesion
		 */
		private String id;
		
		/**
		 * Es la variable que almacenara los número de accesos de la sesion.
		 */
		private int n;
		
		public Sesion(String id){
			this.id=id;
			n=0;
		}
		
		public Sesion(String id,int n){
			this.id=id;
			this.n=n;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public int getN() {
			return n;
		}

		public void setN(int n) {
			this.n = n;
		}
		
		
}
