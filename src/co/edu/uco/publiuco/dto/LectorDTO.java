package co.edu.uco.publiuco.dto;

import co.edu.uco.publiuco.crosscutting.utils.UtilUUID;

import java.util.UUID;

public class LectorDTO {
    private UUID identificador;
    private PersonaDTO datosPersona;
    private EstadoDTO estado;

    public LectorDTO() {
        super();
        setIdentificador(UtilUUID.DEFAULT_UUID);
        setDatosPersona(new PersonaDTO());
        setEstado(new EstadoDTO());
    }

    public LectorDTO(UUID identificador, PersonaDTO datosPersona, EstadoDTO estado) {
        super();
        setIdentificador(identificador);
        setDatosPersona(datosPersona);
        setEstado(estado);
    }

    public UUID getIdentificador() {
        return identificador;
    }

    public PersonaDTO getDatosPersona() {
        return datosPersona;
    }

    public EstadoDTO getEstado() {
        return estado;
    }

    public void setIdentificador(UUID identificador) {
        this.identificador = identificador;
    }

    public void setDatosPersona(PersonaDTO datosPersona) {
        this.datosPersona = datosPersona;
    }

    public void setEstado(EstadoDTO estado) {
        this.estado = estado;
    }
}
