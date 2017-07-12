package pl.droidsonroids.jspoon.exception;

import java.util.Locale;

public class ConstrucorNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -3960224299384172909L;

    public ConstrucorNotFoundException(String className) {
        super(String.format(Locale.ENGLISH, "Default constructor for class %s not found.", className));
    }
}
