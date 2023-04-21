package co.edu.uco.publiuco.dto;

import java.time.LocalDate;
import java.util.UUID;
public final class PublicacionDTO {

	private UUID identificador;
	private CategoriaDTO categoria;
	private TipoAccesoDTO tipoAcceso;
	private LocalDate fechaPublicacion;
	private VersionDTO ultimaVersion;
	private EstadoVersionDTO estado;


}