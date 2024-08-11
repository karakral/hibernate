package org.karakral.hibernate.response;


import org.springframework.stereotype.Component;

import java.util.Calendar;
//TODO Mahsun develop homekanuf project with java 22 and use new technologies
//TODO Mahsun add redis to here
@Component
public class GenericResponse <T>{

    private String code;
    private String message;
    private T response;
    private String time;

    public GenericResponse() {
    }

    public GenericResponse(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public GenericResponse(String code, String message, T response) {
        this.code = code;
        this.message = message;
        this.response = response;
        this.time = Calendar.getInstance().getTimeInMillis() + "";
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
