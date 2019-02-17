package com.ebook.view;


import com.ebook.entity.Note;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    public static final String HELLO_MESSAGE = "Welcome to 'Notebook' !";

    static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
                    new Locale("ua"));
//                    new Locale("en"));


    public void print (String message){
        System.out.println(bundle.getString(message));
    }


public void print(Note note){
    System.out.println(note);
}
    public void print(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

