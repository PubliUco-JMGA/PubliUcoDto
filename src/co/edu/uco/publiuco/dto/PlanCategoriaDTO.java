package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class PlanCategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private int precio;
	private LocalDate fechaDesde;
	private LocalDate fechaHasta;
	private EstadoPlanDTO estado;


}