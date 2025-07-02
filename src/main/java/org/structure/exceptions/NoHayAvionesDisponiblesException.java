package main.java.org.structure.exceptions;

public class NoHayAvionesDisponiblesException extends RuntimeException {
    public NoHayAvionesDisponiblesException(String message) {
        super(message);
    }
}
