package com.ebook.model;

import com.ebook.entity.Note;

import java.util.ArrayList;

public class Model {

    private ArrayList<String> list= new ArrayList();

    public ArrayList getList() {
        return list;
    }

    public void fillList(String info){
        list.add(info);

    }


public Note creatingNote(String name,String surName,String email,String password){
        Note note = new Note(name,surName,password,email);
        printNote(note);


        return note;
}

    public void sendDataToNote(){
       creatingNote(getList().get(0).toString(),getList().get(1).toString(),getList().get(2).toString(),getList().get(3).toString());

    }
















//    public void printName(){
//        System.out.println(note.getName());
//    }


//
    public void printNote(Note note){
        System.out.println(note.getName());
        System.out.println(note.getSurname());
        System.out.println(note.getEmail());
        System.out.println(note.getPassword());
    }

}
