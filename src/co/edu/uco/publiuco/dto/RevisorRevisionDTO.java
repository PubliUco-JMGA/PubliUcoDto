package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class RevisorRevisionDTO {

	private UUID identificador;
	private RevisionDTO revision;
	private RevisorDTO revisor;
	private LocalDate fechaAsignacionRevision;
	private LocalDate fechaCompletitudRevision;
	private EstadoRevisionDTO estado;



}