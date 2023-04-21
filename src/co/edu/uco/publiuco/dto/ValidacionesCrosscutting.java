package co.edu.uco.publiuco.dto;

import java.util.UUID;

public class  ValidacionesCrosscutting {
    public static boolean estaNulaLaCadena (String cadena) {
        return cadena == null;
    }

    public static UUID generarNuevoUUID() {
        return UUID.randomUUID();
    }

    public static String obtenerValorDefecto(){
        return "";
    }
}
