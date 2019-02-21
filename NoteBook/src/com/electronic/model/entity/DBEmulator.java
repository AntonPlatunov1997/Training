package com.electronic.model.entity;

import java.util.ArrayList;

public class DBEmulator {

    private ArrayList<Note> dbList = new ArrayList<>();

    public ArrayList<Note> getDbList() {
        return dbList;
    }

    public DBEmulator() {
        fillDB();
    }

    private void fillDB(){
        dbList.add(new Note("Dima","Bilan","ImBIlan109"));
}

}
