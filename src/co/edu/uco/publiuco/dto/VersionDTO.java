package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class VersionDTO {

	private UUID identificador;
	private PublicacionDTO publicacion;
	private VersionDTO ultimaVersion;
	private int numeroVersion;
	private LocalDate fechaCreacion;
	private LocalDate fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionDTO estado;

}