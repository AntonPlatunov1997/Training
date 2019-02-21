package com.electronic.model.entity;

public class Note {
    private String name;
    private String surName;
    private String password;

    public String getName() {
        return name;
    }

    public  Note(String name, String surName, String password){
    this.name=name;
    this.surName =surName;
    this.password = password;

}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Note{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surName='").append(surName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
