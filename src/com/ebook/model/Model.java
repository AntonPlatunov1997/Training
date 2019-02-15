package com.ebook.model;

import com.ebook.entity.Note;

import java.util.ArrayList;

public class Model {
    private Note note = new Note();
    private ArrayList<String> list= new ArrayList();

    public ArrayList getList() {
        return list;
    }

    public void fillList(String info){
        list.add(info);

    }





    public void printName(){
        System.out.println(note.getName());
    }

    public void sendDataToNote(){
        note.setName(getList().get(0).toString());
        note.setSurname(getList().get(1).toString());
        note.setEmail(getList().get(2).toString()) ;
        note.setPassword(getList().get(3).toString());
    }

    public void printNote(){
        System.out.println(note.getName());
        System.out.println(note.getSurname());
        System.out.println(note.getEmail());
        System.out.println(note.getPassword());
    }

}
