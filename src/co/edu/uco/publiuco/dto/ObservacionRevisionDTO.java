package co.edu.uco.publiuco.dto;

import java.time.LocalDateTime;
import java.util.UUID;
public final class ObservacionRevisionDTO {

	private UUID identificador;
	private EscritorPublicacionDTO escritor;
	private ComentarioRevisorDTO comentario;
	private LocalDateTime fechaReporteObservacion;
	private LocalDateTime fechaRevisionObservacion;
	private String observacion;
	private EstadoObservacionRevisorDTO estadoObservacion;


}