package comunicacion;

public class Alfabeto extends Pictograma {
	
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras, String interpretacion) {
		
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
		
	}
	
	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public int cantidadLetras() {
		
		return this.letras.length;
			
	}
	
	public String interpretacion() {
		
		return this.getInterpretacion();
		
	}
	
	public String toString() {
		
		String imp = "";
		
		for (int i = 0; i < this.letras.length; i++) {
			
			if (i == (this.letras.length-1)) {
				
				imp += this.letras[i];
			}
			
			else {
				
				imp += this.letras[i];
				imp += ", ";
			}
		}
		return imp;
	}
}
