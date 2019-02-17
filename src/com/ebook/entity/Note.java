package com.ebook.entity;

public class Note {
    private String name;
    private String surname;
    private String password;
    private String email;

    public Note(String name, String surname, String password, String email) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.email = email;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Note{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

