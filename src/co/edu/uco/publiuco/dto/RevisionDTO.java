package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class RevisionDTO {

	private UUID identificador;
	private VersionDTO version;
	private TipoRevisionDTO tipoRevision;
	private LocalDate fechaSolicitudRevision;
	private LocalDate fechaLimiteRevision;
	private LocalDate fechaCompletitudRevision;
	private AdministradorCategoriaDTO administrador;
	private EstadoRevisionDTO revision;



}