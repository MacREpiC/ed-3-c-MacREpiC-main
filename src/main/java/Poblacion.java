public class Poblacion {
	public static String clasifica(int edad, char genero)
			throws EdadErroneaException, GeneroErroneoException {
		String respuesta = "";
		genero = Character.toUpperCase(genero);

		if (edad < 0 || edad > 125) {
			throw new EdadErroneaException(edad);
		}

		if (edad < 18) {
			respuesta = "menor";
		} else {
			if (edad < 65) {
				switch (genero) {
				case 'H':
					respuesta = "trabajador";
					break;
				case 'M':
					respuesta = "trabajadora";
					break;
				default:
					throw new GeneroErroneoException(genero);
				}
			} else {
				switch (genero) {
				case 'H':
					respuesta = "jubilado";
					break;
				case 'M':
					respuesta = "jubilada";
					break;
				default:
					throw new GeneroErroneoException(genero);
				}
			}
		}
		return respuesta;
	}
}
