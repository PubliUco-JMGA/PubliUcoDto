package co.edu.uco.publiuco.dto;

import java.util.UUID;
public final class EstadoEscritorDTO {

	private UUID identificador;
	private String nombre;
	private String descripcion;

	public EstadoEscritorDTO() {
		super();
		this.identificador = generarNuevoUUID();
		this.nombre = obtenerValorDefecto();
		this.descripcion = obtenerValorDefecto();
	}

	public EstadoEscritorDTO(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
	}

	public final UUID getIdentificador() {
		return identificador;
	}

	public final EstadoEscritorDTO setIdentificador(final UUID identificador) {
		this.identificador = identificador;
		if (!esVaciaONulaLaCadena(identificador.toString())) {
			this.identificador = generarNuevoUUID();
		}
		return this;
	}

	public final String getNombre() {
		return nombre;
	}

	public final EstadoEscritorDTO setNombre(final String nombre) {

		if (!esVaciaONulaLaCadena(nombre)) {
			this.nombre = nombre.trim();
		}
		return this;
	}

	public final String getDescripcion() {
		return descripcion;
	}

	public final EstadoEscritorDTO setDescripcion(final String descripcion) {
		this.descripcion = descripcion;

		if(esVaciaONulaLaCadena(descripcion)){
			this.descripcion = getNombre();
		}

		return this;
	}

	//INICIO Métodos de CROSS CUTTING

	public static boolean esVaciaONulaLaCadena (String cadena) {
		return cadena == null || "".equals(cadena.trim().intern());
	}

	public static UUID generarNuevoUUID() {
		return UUID.randomUUID();
	}

	public static String obtenerValorDefecto(){
		return "";
	}

	//FIN MÉTODOS CROSS CUTTING
}