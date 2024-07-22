package org.karakral.hibernate.exception;

public class ExceptionErrorResponse {
    private int status;
    private String message;

    public ExceptionErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }

}
