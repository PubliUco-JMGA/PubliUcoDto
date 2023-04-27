package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilObject;
import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class EscritorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private TipoRelacionInstitucionDTO tipoRelacionInstitucion;
    private EstadoDTO estado;

    public EscritorDTO() {
        super();
        setIdentificador(UtilUUID.getDefaultValue());
        setDatosPersona(PersonaDTO.create());
        setTipoRelacionInstitucion(TipoRelacionInstitucionDTO.create());
        setEstado(EstadoDTO.create());
    }
    public EscritorDTO(UUID identificador, PersonaDTO datosPersona, TipoRelacionInstitucionDTO tipoRelacionInstitucion, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setTipoRelacionInstitucion(tipoRelacionInstitucion);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getDatosPersona() {
        return datosPersona;
    }

    public TipoRelacionInstitucionDTO getTipoRelacionInstitucion() {
        return tipoRelacionInstitucion;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public EscritorDTO setIdentificador(UUID identificador) {
        this.identificador = UtilUUID.getDefault(identificador);
        return this;
    }

    public EscritorDTO setDatosPersona(PersonaDTO datosPersona) {
        this.datosPersona = UtilObject.getDefault(datosPersona, PersonaDTO.create());
        return this;
    }

    public EscritorDTO setTipoRelacionInstitucion(TipoRelacionInstitucionDTO tipoRelacionInstitucion) {
        this.tipoRelacionInstitucion = UtilObject.getDefault(tipoRelacionInstitucion, TipoRelacionInstitucionDTO.create());
        return this;
    }

    public EscritorDTO setEstado(EstadoDTO estado) {
        this.estado = UtilObject.getDefault(estado,EstadoDTO.create());
        return this;
    }
    public static EscritorDTO create (){
        return new EscritorDTO();
    }
}
