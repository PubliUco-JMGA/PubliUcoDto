package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilDate;
import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.UUID;

public class ReporteDTO {
    private UUID identificador;
    private LectorDTO lector;
    private ComentarioLectorDTO comentario;
    private String razon;
    private TipoReporteDTO tipoReporte;
    private LocalDateTime fechaReporte;

    public ReporteDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorDTO.create());
        setComentario(ComentarioLectorDTO.create());
        setRazon(UtilText.getDefaultValue());
        setTipoReporte(TipoReporteDTO.create());
        setFechaReporte(UtilDate.getDefaultValue());
    }

    public ReporteDTO(UUID identificador, LectorDTO lector, ComentarioLectorDTO comentario, String razon, TipoReporteDTO tipoReporte, LocalDateTime fechaReporte) {
        setIdentificador(identificador);
        setLector(lector);
        setComentario(comentario);
        setRazon(razon);
        setTipoReporte(tipoReporte);
        setFechaReporte(fechaReporte);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public ComentarioLectorDTO getComentario() {
        return comentario;
    }

    public String getRazon() {
        return razon;
    }

    public TipoReporteDTO getTipoReporte() {
        return tipoReporte;
    }

    public LocalDateTime getFechaReporte() {
        return fechaReporte;
    }

    public ReporteDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public ReporteDTO setLector(LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public ReporteDTO setComentario(ComentarioLectorDTO comentario) {
        this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDTO.create());
        return this;
    }

    public ReporteDTO setRazon(String razon) {
        this.razon = UtilText.applyTrim(razon);
        return this;
    }

    public ReporteDTO setTipoReporte(TipoReporteDTO tipoReporte) {
        this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDTO.create());
        return this;
    }

    public ReporteDTO setFechaReporte(LocalDateTime fechaReporte) {
        this.fechaReporte = UtilDate.getDefault(fechaReporte);
        return this;
    }
    public static ReporteDTO create (){
        return new ReporteDTO();
    }
}
