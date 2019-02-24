package com.electronic.controller;


import com.electronic.exception.NameUniqueException;
import com.electronic.model.entity.DBEmulator;
import com.electronic.model.entity.Note;



import com.electronic.view.Messages;
import com.electronic.view.View;


import java.util.Scanner;

public class UtilityController {
    private View view = new View();
    private DBEmulator dbEmulator = new DBEmulator();



    Scanner sc = new Scanner(System.in);


public String checkInputData(String regex){

    String res = sc.nextLine();
    while (!res.matches(regex)){
        view.print(Messages.WRONG_INPUT_DATA);
        res =sc.nextLine();
    }
    return res;

}
    public void fillFildsNote(){


        String name;
        String surName;
        String password;
        view.print(Messages.NAME_MESSAGE);

        name =checkInputData(Regex.NAME);



    view.print(Messages.SURNAME_MESSAGE);

         surName= checkInputData(Regex.SURNAME);

        view.print(Messages.PASSWORD_MESSAGE);
        password= checkInputData(Regex.PASSWORD);

        try {
            checkUnique(name,dbEmulator);
        }catch (NameUniqueException ex){
            ex.printStackTrace();
            System.exit(0);

        }
        creatingNote(name,surName,password);


    }

    public Note creatingNote(String name, String surName, String password){
// во модель

        Note note = new Note(name,surName,password);
        dbEmulator.getDbList().add(note);
        System.out.println(dbEmulator.getDbList().toString());
        return note;
    }

public void checkUnique(String name,DBEmulator dbEmulator)throws NameUniqueException{
    dbEmulator.getDbList();
    for (int i=0;i<dbEmulator.getDbList().size();i++){
       Note note = dbEmulator.getDbList().get(i);

       if (note.getName().equals(name)){
           throw new NameUniqueException(name);
       }


    }

}


}
