package cimap.recursos_humanos.api.util;

import cimap.recursos_humanos.api.exception.ApiException;

public class ValidacionCorta {
	
	
	
	private ValidacionCorta() {

	}

	/**
	 * valida que el id no sea nulo
	 * 
	 * @param id
	 */
	public static void validarId(Integer id, String mjs) {
		if (!ValidacionUtil.esNumeroIntegerPositivoInt(id))
			throw new ApiException(mjs);
	}

	/**
	 * validar campos no sea nulo
	 * 
	 * @param cve
	 */
	public static void validarStrNull(String cve, String mjs) {
		if (ValidacionUtil.esCadenaVacia(cve))
			throw new ApiException(mjs);
	}
	
	/**
	 * validar campos de tipo string
	 * 
	 * @param cve
	 */
	public static void validarStr(String cve, String mjs) {
		if (!ValidacionUtil.tieneCadenaFormatoLetras(cve))
			throw new ApiException(mjs);
	}
	
	/**
	 * validar campos de tipo Integer
	 * 
	 * @param cve
	 */
	public static void validarInt(String cve, String mjs) {
		if (!ValidacionUtil.tieneCadenaFormatoNumero(cve))
			throw new ApiException(mjs);
	}
}
