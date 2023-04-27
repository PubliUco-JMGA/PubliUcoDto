package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PerfilDTO {
    private UUID identificador;
    private LectorDTO lector;
    private RespuestaDTO deseaRecibirRecomendacionesDeCategoria;
    private RespuestaDTO deseaRecibirRecomendacionesDeAutor;

    public PerfilDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setLector(LectorDTO.create());
        setDeseaRecibirRecomendacionesDeCategoria(RespuestaDTO.create());
        setDeseaRecibirRecomendacionesDeAutor(RespuestaDTO.create());
    }

    public PerfilDTO(UUID identificador, LectorDTO lector, RespuestaDTO deseaRecibirRecomendacionesDeCategoria, RespuestaDTO deseaRecibirRecomendacionesDeAutor) {
       super();
       setIdentificador(identificador);
       setLector(lector);
       setDeseaRecibirRecomendacionesDeCategoria(deseaRecibirRecomendacionesDeCategoria);
       setDeseaRecibirRecomendacionesDeAutor(deseaRecibirRecomendacionesDeAutor);
    }

    public UUID getIdentificador(){
        return identificador;
    }

    public LectorDTO getLector() {
        return lector;
    }

    public RespuestaDTO getDeseaRecibirRecomendacionesDeCategoria() {
        return deseaRecibirRecomendacionesDeCategoria;
    }

    public RespuestaDTO getDeseaRecibirRecomendacionesDeAutor() {
        return deseaRecibirRecomendacionesDeAutor;
    }

    public PerfilDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PerfilDTO setLector(LectorDTO lector) {
        this.lector = UtilObject.getDefault(lector, LectorDTO.create());
        return this;
    }

    public PerfilDTO setDeseaRecibirRecomendacionesDeCategoria(RespuestaDTO deseaRecibirRecomendacionesDeCategoria) {
        this.deseaRecibirRecomendacionesDeCategoria = UtilObject.getDefault(deseaRecibirRecomendacionesDeCategoria, RespuestaDTO.create());
        return this;
    }

    public PerfilDTO setDeseaRecibirRecomendacionesDeAutor(RespuestaDTO deseaRecibirRecomendacionesDeAutor) {
        this.deseaRecibirRecomendacionesDeAutor = UtilObject.getDefault(deseaRecibirRecomendacionesDeAutor, RespuestaDTO.create());
        return this;
    }
    public static PerfilDTO create (){
        return new PerfilDTO();
    }
}
