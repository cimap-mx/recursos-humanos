package cimap.recursos_humanos.util;

import java.math.BigDecimal;
import java.util.Date;

import org.joda.time.DateTime;

public class ValidacionUtil {

	private ValidacionUtil() {

	}

	public static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	/**
	 * Valida si un bigdecimal es positivo
	 */
	public static boolean esNumeroBigDecimalPositivo(BigDecimal numero) {
		boolean esNumeroPositivo = true;
		if (numero == null || numero.compareTo(BigDecimal.ZERO) == -1) {
			esNumeroPositivo = false;
		}
		return esNumeroPositivo;
	}

	/**
	 * Valida si un bigdecimal es mayor o igual a cero.
	 */
	public static boolean esMayorCero(BigDecimal numero) {
		boolean esMayorCero = false;
		if (numero.compareTo(BigDecimal.ZERO) == 1) {
			esMayorCero = true;
		}
		return esMayorCero;
	}

	/**
	 * Permite saber si el numero que recibe es menor que uno. En caso de que el
	 * valor sea nulo se devolvera verdad.
	 * 
	 * @param numero un número a identificar.
	 * @return verdad sí y sólo sí el numero es menor que uno.
	 */
	public static boolean esMenorQueUno(Number numero) {
		if (numero == null) {
			return true;
		}

		if (numero instanceof BigDecimal) {
			BigDecimal decimal = (BigDecimal) numero;

			return decimal.compareTo(BigDecimal.ONE) == -1;
		}

		if (numero instanceof Double) {
			return numero.doubleValue() < 1;
		}

		return numero.intValue() < 1;
	}

	/**
	 * Valida si un bigdecimal es Nulo o igual a cero. pablinsky
	 */
	public static boolean esNulo(BigDecimal numero) {
		boolean esValido = true;
		if (numero == null) {
			esValido = false;
		} else {
			if (numero.compareTo(BigDecimal.ZERO) == 0) {
				esValido = false;
			}
		}
		return esValido;
	}

	/**
	 * Valida si la cadena está vacia. En caso de que la cadena sea null se
	 * devolvera
	 * 
	 * @param cadena
	 * @return true: si la cadena está vacia, false: si la adena no esta vacia.
	 */
	public static boolean esCadenaVacia(String cadena) {
		return cadena == null || cadena.trim().isEmpty();
	}

	public static boolean sonIguales(BigDecimal primerImporte, BigDecimal segundoImporte) {
		boolean sonIguales = false;
		if (primerImporte.compareTo(segundoImporte) == 0) {
			sonIguales = true;
		}

		return sonIguales;
	}



	/**
	 * Valida si el numero no es nulo o igual a cero
	 */
	public static boolean esNumeroIntegerPositivoInt(Integer numero) {
		boolean esValido = true;
		if (numero == null) {
			esValido = false;
		} else {
			if (numero == 0) {
				esValido = false;
			}
		}
		return esValido;
	}

	/**
	 * Valida que la fecha no sea mayor a la fecha actual.
	 */
	public static boolean esFechaFutura(Date fecha) {
		boolean esValida = false;
		DateTime fechaValidada = new DateTime(fecha);
		fechaValidada.withHourOfDay(0);
		fechaValidada.withMinuteOfHour(0);
		fechaValidada.withSecondOfMinute(0);
		fechaValidada.withMillisOfSecond(0);
		fechaValidada.withMillis(0);

		DateTime fechaActual = new DateTime();
		fechaActual.withHourOfDay(0);
		fechaActual.withMinuteOfHour(0);
		fechaActual.withSecondOfMinute(0);
		fechaActual.withMillisOfSecond(0);
		fechaActual.withMillis(0);

		if (fechaValidada.isAfter(fechaActual)) {
			esValida = true;
		}

		return esValida;
	}

	/**
	 * Valida que el formato del RFC sea correcto.
	 * <p>
	 * En caso de que el RFC sea nulo se devolvera <code>false</code>
	 * </p>
	 * 
	 * @param rfc el RFC que será validado.
	 * @return <code>true</code> si el formato del RFC y <code>false</code> en caso
	 *         de que el formato no se valido.
	 */
	public static boolean validarRfc(String rfc) {
		if (rfc == null) {
			return false;
		}
		rfc = rfc.toUpperCase().trim();
		if (rfc.length() < 12) {
			return false;
		}
		if (rfc.trim().matches("([A-Z]{4})([0-9]{6})([A-Z0-9]{3})")) {
			return true;
		}
		return rfc.trim().matches("[A-Z]{3}[0-9]{6}[A-Z0-9]{3}");
	}

	/**
	 * Valida que el curp sea correcto
	 * 
	 * @param curp
	 * @return
	 */
	public static boolean validarCurp(String curp) {
		curp = curp.toUpperCase().trim();
		return curp.toUpperCase().matches("[A-Z]{4}[0-9]{6}[A-Z]{3}[A-Z0-9]{5}");
	}

	/**
	 * Valida que la cadena solo contenga números.
	 */
	public static boolean tieneCadenaFormatoNumero(String cadena) {
		 return cadena.matches("[0-9]*");
	}

	/**
	 * Valida que la cadena solo contenga letras.
	 */
	public static boolean tieneCadenaFormatoLetras(String cadena) {
		return cadena.matches("[a-z]");
	}
}
