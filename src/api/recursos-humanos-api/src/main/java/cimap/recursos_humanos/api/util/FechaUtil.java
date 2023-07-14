package cimap.recursos_humanos.api.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateTime;

import cimap.recursos_humanos.api.exception.ApiException;

public class FechaUtil {

	public static final String PATRON_FECHA_CORTA = "dd/MM/yyyy";
	public static final Locale LUGAR_MEXICO = new Locale("es", "MX");
	

	private FechaUtil() {

	}
	
	public static Date formatearStrngToDate(String fecha) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(PATRON_FECHA_CORTA, LUGAR_MEXICO);
		try {
			return dateFormat.parse(fecha);
		} catch (ParseException e) {
			return null;
		}
	}

	public static Date fechaActual() {
		DateTime fechaActual = DateTime.now();
		return fechaActual.toDate();
	}
	
	public static int ejercicioActual() {
		return DateTime.now().getYear();
	}
	
	public static int mesActual() {
		return DateTime.now().getMonthOfYear();
	}
	
	public static void validarMes(Integer mes) {
		if(mes == null) {
			throw new ApiException("El mes es requerido");
		}
		
		if(mes < 1 || mes > 12) {
			throw new ApiException("El mes debe estar entre 1 y 12");
		}
	}
	
	
}
