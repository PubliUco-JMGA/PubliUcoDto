package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.time.LocalDateTime;
import java.util.UUID;

public class CategoriaDTO {
    private UUID identificador;
    private CategoriaDTO categoriaPadre;
    private String nombre;
    private String descripcion;
    private EstadoDTO estado;

    public CategoriaDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setCategoriaPadre(CategoriaDTO.create());
        setNombre(UtilText.getDefaultValue());
        setDescripcion(UtilText.getDefaultValue());
        setEstado(EstadoDTO.create());
    }

    public CategoriaDTO(UUID identificador, CategoriaDTO categoriaPadre, String nombre, String descripcion, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setCategoriaPadre(categoriaPadre);
        setNombre(nombre);
        setDescripcion(descripcion);
        setEstado(estado);
    }


    public UUID getIdentificador() {
        return identificador;
    }

    public CategoriaDTO getCategoriaPadre() {
        return categoriaPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public CategoriaDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public CategoriaDTO setCategoriaPadre(CategoriaDTO categoriaPadre) {
        this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDTO.create());
        return this;
    }

    public CategoriaDTO setNombre(String nombre) {
        this.nombre = UtilText.applyTrim(nombre);
        return this;
    }

    public CategoriaDTO setDescripcion(String descripcion) {
        this.descripcion = UtilText.applyTrim(descripcion);
        return this;
    }

    public CategoriaDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado, EstadoDTO.create());
        return this;
    }
    public static CategoriaDTO create (){
        return new CategoriaDTO();
    }
}
