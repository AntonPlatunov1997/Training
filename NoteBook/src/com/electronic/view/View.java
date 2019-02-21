package com.electronic.view;

import com.electronic.model.entity.Note;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle =
            ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME,
//                    new Locale("ua"));
                    new Locale("en"));




    public void print(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
    public void print(String message){
        System.out.println(message);
    }
    public void print(Note note){
        System.out.println(note);
    }
}
