package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
public final class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String cotenido;
	private LocalDateTime fechaCalificacion;
	private EstadoDTO estado;

	private static final ComentarioLectorDTO INSTANCE_DEFAULT = ComentarioLectorDTO.create();

	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(getDefaultValue());
		setCotenido(UtilText.getDefaultValue());
		setFechaCalificacion(UtilDate.getDefaultValue());
		setEstado(EstadoDTO.create() );
	}


	public static void main(String[] args) {
		ComentarioLectorDTO comentarioLectorDTO = ComentarioLectorDTO.create();
	}

	public ComentarioLectorDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion, ComentarioLectorDTO comentarioPadre, String contenido, LocalDateTime fechaCalificacion, EstadoDTO estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentarioPadre(comentarioPadre);
		setPublicacion(publicacion);
		setCotenido(contenido);
		setFechaCalificacion(fechaCalificacion);
		setEstado(estado);
	}

	public static ComentarioLectorDTO getDefaultValue() {
		return INSTANCE_DEFAULT;
	}

	public UUID getIdentificador() {
		return identificador;
	}

	public LectorDTO getLector() {
		return lector;
	}

	public PublicacionDTO getPublicacion() {
		return publicacion;
	}

	public ComentarioLectorDTO getComentarioPadre() {
		return comentarioPadre;
	}

	public String getCotenido() {
		return cotenido;
	}

	public LocalDateTime getFechaCalificacion() {
		return fechaCalificacion;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public ComentarioLectorDTO setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public ComentarioLectorDTO setLector(LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public ComentarioLectorDTO setPublicacion(PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public ComentarioLectorDTO setComentarioPadre(ComentarioLectorDTO comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		return this;
	}

	public ComentarioLectorDTO setEstado(EstadoDTO estado) {
		this.estado = estado;
		return this;
	}

	public ComentarioLectorDTO setCotenido(String cotenido) {
		this.cotenido = cotenido;
		return this;
	}

	public ComentarioLectorDTO setFechaCalificacion(LocalDateTime fechaCalificacion) {
		this.fechaCalificacion = fechaCalificacion;
		return this;
	}

	public static ComentarioLectorDTO create (){
		return new ComentarioLectorDTO();
	}
}