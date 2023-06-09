package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import co.edu.uco.publiuco.utils.UtilBoolean;
import co.edu.uco.publiuco.utils.UtilDate;
import co.edu.uco.publiuco.utils.UtilObject;
import co.edu.uco.publiuco.utils.UtilText;
import co.edu.uco.publiuco.utils.UtilUUID;

public final class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private boolean tienePadre;
	private String contenido;
	private LocalDateTime fechaComentario;
	private EstadoDTO estado;
	private static final String UUID_COMENTARIO_RAIZ = "e1197bb4-2978-49f8-baaa-fd69d694dffa";
	private static final ComentarioLectorDTO RAIZ;

	static {
		RAIZ = new ComentarioLectorDTO(UtilUUID.generateUUIDFromString(UUID_COMENTARIO_RAIZ),

				LectorDTO.create(), PublicacionDTO.create(), null, UtilText.getDefaultValue(),
				UtilDate.getDefaultValue(), EstadoDTO.create(), UtilBoolean.getDefaultValue());
	}

	public ComentarioLectorDTO() {
		super();
		setIdentificador(UtilUUID.getDefaultValue());
		setLector(LectorDTO.create());
		setPublicacion(PublicacionDTO.create());
		setComentarioPadre(RAIZ);
		setCotenido(UtilText.getDefaultValue());
		setFechaComentario(UtilDate.getDefaultValue());
		setEstado(EstadoDTO.create());
		setTienePadre(UtilBoolean.getDefaultValue());
	}

	public ComentarioLectorDTO(UUID identificador, LectorDTO lector, PublicacionDTO publicacion,
			ComentarioLectorDTO comentarioPadre, String contenido, LocalDateTime fechaComentario, EstadoDTO estado,
			boolean tienePadre) {
		setIdentificador(identificador);
		setLector(lector);
		setComentarioPadre(comentarioPadre);
		setPublicacion(publicacion);
		setCotenido(contenido);
		setFechaComentario(fechaComentario);
		setEstado(estado);
		setTienePadre(tienePadre);
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
		return contenido;
	}

	public LocalDateTime getFechaComentario() {
		return fechaComentario;
	}

	public EstadoDTO getEstado() {
		return estado;
	}

	public ComentarioLectorDTO setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		return this;
	}

	public ComentarioLectorDTO setLector(final LectorDTO lector) {
		this.lector = UtilObject.getDefault(lector, LectorDTO.create());
		return this;
	}

	public ComentarioLectorDTO setPublicacion(final PublicacionDTO publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDTO.create());
		return this;
	}

	public ComentarioLectorDTO setComentarioPadre(final ComentarioLectorDTO comentarioPadre) {
		if (isTienePadre()) {
			this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDTO.create());
		} else {
			this.comentarioPadre = RAIZ;
		}
		return this;
	}

	public ComentarioLectorDTO setEstado(final EstadoDTO estado) {
		this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
		return this;
	}

	public ComentarioLectorDTO setCotenido(final String cotenido) {
		this.contenido = UtilText.applyTrim(cotenido);
		return this;
	}

	public ComentarioLectorDTO setFechaComentario(final LocalDateTime fechaComentario) {
		this.fechaComentario = UtilDate.getDefault(fechaComentario);
		return this;
	}

	public static ComentarioLectorDTO create() {
		return new ComentarioLectorDTO();
	}

	public boolean isTienePadre() {
		return tienePadre;
	}

	public ComentarioLectorDTO setTienePadre(boolean tienePadre) {
		this.tienePadre = UtilBoolean.getDefault(tienePadre);
		return this;
	}
}