package org.teamone.domain;

public class Subject {

    private int code;
    private String name;
    private int status;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Subject{" + "code=" + code + ", name=" + name + ", status=" + status + '}';
    }
    
    
}