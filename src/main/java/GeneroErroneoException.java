public class GeneroErroneoException extends Exception {
	private static final long serialVersionUID = -8072783108261580994L;
	char recibido;

	public GeneroErroneoException(char genero) {
		super();
		this.recibido=genero;
	}

	@Override
	public String getMessage() {
		return("El género recibido ("+this.recibido+") está fuera del rango (h,H,m,M).");
	}

}
