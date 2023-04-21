package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class ReporteDTO {

	private UUID identificador;
	private LectorDTO lector;
	private ComentarioLectorDTO comentarioReportado;
	private TipoReporteDTO tipoReporte;
	private String razon;
	private LocalDate fechaReporte;



}