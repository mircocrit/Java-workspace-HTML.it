public class Scope {
	int var = 6;
	public void primoMetodo(int var) {
		int i = var;
		// in questo caso ha precedenza il parametro e
		// i assume il valore che sarà passato come parametro al metodo
		// ...
	}
	public void secondoMetodo() {
		int var = 7;
		int i = var;
		// qui ha precedenza la variabile locale al metodo, quindi
		// i ha il valore 7
		// ...
	}
	public void terzoMetodo() {
		int i = var;
		// qui semplicemente assegnamo ad i il valore della
		// variabile di istanza e i prende il valore 6
		// ...
	}
	public void quartoMetodo(int var) {
		int i = this.var;
		// in questo caso i assume il valore 6 indipendentemente
		// dal valore del parametro poiché abbiamo utilizzato la
		// keyword 'this', indica di utilizzare la variabile 'var'
		// che abbiamo definito come field e che appartiene
		// all'istanza corrente della classe.
		// ...
	}
	
	
	static int var2 = 6;
	
	
}