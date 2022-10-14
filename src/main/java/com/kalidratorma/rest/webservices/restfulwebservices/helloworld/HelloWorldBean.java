package com.kalidratorma.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
