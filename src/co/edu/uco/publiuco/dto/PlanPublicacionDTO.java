package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class PlanPublicacionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private EstadoPlanDTO estado;


}