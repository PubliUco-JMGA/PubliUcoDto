package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;
public final class CalificacionDTO {

	private UUID identificador;
	private LectorDTO lector;
	private PublicacionDTO publicacion;
	private LocalDateTime fechaCalificacion;
	private String calificacion;

}