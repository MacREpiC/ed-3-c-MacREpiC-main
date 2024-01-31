public class EdadErroneaException extends Exception {
	private static final long serialVersionUID = -3699975199153805360L;
	int recibido;

	public EdadErroneaException(int edad) {
		super();
		this.recibido=edad;
	}

	@Override
	public String getMessage() {
		return("La edad recibida ("+this.recibido+") está fuera del rango 0-125");
	}
}
