package co.edu.uco.publiuco.dto;

import java.util.UUID;
public final class CategoriaDTO {

	private UUID identificador;
	private CategoriaDTO categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDTO estadoCategoria;


}