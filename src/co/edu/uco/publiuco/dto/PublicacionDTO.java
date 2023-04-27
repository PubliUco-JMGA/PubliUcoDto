package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class PublicacionDTO {
    private UUID identificador;
    private CategoriaDTO categoria;
    private TipoAccesoDTO tipoAcceso;
    private LocalDateTime fechaPublicacion;
    private VersionDTO versionPublicada;
    private EstadoDTO estado;

    public PublicacionDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoria(CategoriaDTO.create());
        setTipoAcceso(TipoAccesoDTO.create());
        setFechaPublicacion(UtilDate.getDefaultValue());
        setVersionPublicada(VersionDTO.create());
        setEstado(EstadoDTO.create());
    }

    public PublicacionDTO(UUID identificador, CategoriaDTO categoria, TipoAccesoDTO tipoAcceso, LocalDateTime fechaPublicacion, VersionDTO versionPublicada, EstadoDTO estado) {
        setIdentificador(identificador);
        setCategoria(categoria);
        setTipoAcceso(tipoAcceso);
        setFechaPublicacion(fechaPublicacion);
        setVersionPublicada(versionPublicada);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public TipoAccesoDTO getTipoAcceso() {
        return tipoAcceso;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public VersionDTO getVersionPublicada() {
        return versionPublicada;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public PublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PublicacionDTO setCategoria(CategoriaDTO categoria) {
        this.categoria = UtilObject.getDefault(categoria, CategoriaDTO.create());
        return this;
    }

    public PublicacionDTO setTipoAcceso(TipoAccesoDTO tipoAcceso) {
        this.tipoAcceso = UtilObject.getDefault(tipoAcceso, TipoAccesoDTO.create());
        return this;
    }

    public PublicacionDTO setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = UtilDate.getDefault(fechaPublicacion);
        return this;
    }

    public PublicacionDTO setVersionPublicada(VersionDTO versionPublicada) {
        this.versionPublicada = UtilObject.getDefault(versionPublicada, VersionDTO.create());
        return this;
    }

    public PublicacionDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static PublicacionDTO create (){
        return new PublicacionDTO();
    }
}
