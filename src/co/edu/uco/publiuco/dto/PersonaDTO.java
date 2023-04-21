package co.edu.uco.publiuco.dto;

import java.util.UUID;
public final class PersonaDTO {

	private UUID identificador;
	private TipoIdentificacionDTO tipoIdentificacion;
	private String identificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String indicadorPaisTelefono;
	private String numTelefonoMovil;
	private String correoElectronico;
	private RespuestaDTO cuentaCorreoElectronicoConfirmada;
	private RespuestaDTO numeroTelefonoMovilConfirmado;
	private TipoRelacionInstitucionDTO tipoRelacionInstitucion;

	public PersonaDTO(UUID identificador, TipoIdentificacionDTO tipoIdentificacion,
					  String identificacion, String primerNombre, String segundoNombre, String primerApellido,
					  String segundoApellido, String indicadorPaisTelefono, String numTelefonoMovil, String correoElectronico,
					  RespuestaDTO cuentaCorreoElectronicoConfirmada, RespuestaDTO numeroTelefonoMovilConfirmado, TipoRelacionInstitucionDTO tipoRelacionInstitucion) {

		this.identificador = identificador;
		this.tipoIdentificacion = tipoIdentificacion;
		this.identificacion = identificacion;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.indicadorPaisTelefono = indicadorPaisTelefono;
		this.numTelefonoMovil = numTelefonoMovil;
		this.correoElectronico = correoElectronico;
		this.cuentaCorreoElectronicoConfirmada = cuentaCorreoElectronicoConfirmada;
		this.numeroTelefonoMovilConfirmado = numeroTelefonoMovilConfirmado;
		this.tipoRelacionInstitucion = tipoRelacionInstitucion;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}

	public String getNumTelefonoMovil() {
		return numTelefonoMovil;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public RespuestaDTO getCuentaCorreoElectronicoConfirmada() {
		return cuentaCorreoElectronicoConfirmada;
	}

	public RespuestaDTO getNumeroTelefonoMovilConfirmado() {
		return numeroTelefonoMovilConfirmado;
	}

	public void setIdentificador(UUID identificador) {
		this.identificador = identificador;
	}

	public void setTipoIdentificacion(TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public void setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = indicadorPaisTelefono;
	}

	public void setNumTelefonoMovil(String numTelefonoMovil) {
		this.numTelefonoMovil = numTelefonoMovil;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public void setCuentaCorreoElectronicoConfirmada(RespuestaDTO cuentaCorreoElectronicoConfirmada) {
		this.cuentaCorreoElectronicoConfirmada = cuentaCorreoElectronicoConfirmada;
	}

	public void setNumeroTelefonoMovilConfirmado(RespuestaDTO numeroTelefonoMovilConfirmado) {
		this.numeroTelefonoMovilConfirmado = numeroTelefonoMovilConfirmado;
	}

	public TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
		return tipoRelacionInstitucion;
	}

	public void setTipoRelacionInstitucion(TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
		this.tipoRelacionInstitucion = tipoRelacionInstitucion;
	}
}