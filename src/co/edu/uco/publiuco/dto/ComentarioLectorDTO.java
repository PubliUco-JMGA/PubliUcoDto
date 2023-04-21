package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class ComentarioLectorDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private ComentarioLectorDTO comentarioPadre;
	private String cotenido;
	private LocalDate fechaCalificacion;
	private EstadoComentarioLectorDTO estado;

}