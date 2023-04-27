package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilText;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class PalabraClavePublicacionDTO {
    private UUID identificador;
    private PublicacionDTO publicacion;
    private String palabraClave;

    public PalabraClavePublicacionDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setPublicacion(PublicacionDTO.create());
        setPalabraClave(UtilText.getDefaultValue());
    }

    public PalabraClavePublicacionDTO(UUID identificador, PublicacionDTO publicacion, String palabraClave) {
        super();
        setIdentificador(identificador);
        setPublicacion(publicacion);
        setPalabraClave(palabraClave);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PublicacionDTO getPublicacion() {
        return publicacion;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public PalabraClavePublicacionDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public PalabraClavePublicacionDTO setPublicacion(PublicacionDTO publicacion) {
        this.publicacion = UtilObject.getDefault(publicacion,PublicacionDTO.create());
        return this;
    }

    public PalabraClavePublicacionDTO setPalabraClave(String palabraClave) {
        this.palabraClave = UtilText.applyTrim(palabraClave);
        return this;
    }
    public static PalabraClavePublicacionDTO create (){
        return new PalabraClavePublicacionDTO();
    }
}
