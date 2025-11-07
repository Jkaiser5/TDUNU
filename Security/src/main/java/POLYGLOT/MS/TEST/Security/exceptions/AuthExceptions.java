package POLYGLOT.MS.TEST.Security.exceptions;

import lombok.Getter;

@Getter
public class AuthExceptions extends RuntimeException{

    private String mensajeError;

    public AuthExceptions(final String mensajeError) {
        super(mensajeError);//llamando al constructor padre
        this.mensajeError = mensajeError;
    }

    

}
