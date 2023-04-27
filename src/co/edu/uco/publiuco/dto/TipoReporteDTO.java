package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class TipoReporteDTO {
    private UUID identificador;
    private String nombre;
    private String descripcion;

    public TipoReporteDTO() {
        setIdentificador(UtilUUID.getDefaultValue());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
    }
    public TipoReporteDTO(UUID identificador, String nombre, String descripcion) {
        setIdentificador(identificador);
        setNombre(nombre);
        setDescripcion(descripcion);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }


    public TipoReporteDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public TipoReporteDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public TipoReporteDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }
    public static TipoReporteDTO create (){
        return new TipoReporteDTO();
    }


}

