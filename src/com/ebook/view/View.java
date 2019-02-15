package com.ebook.view;


import java.util.ArrayList;

public class View {
    public static final String HELLO_MESSAGE = "Welcome to 'Notebook' !";


    public void print (String message){
        System.out.println(message);
    }

    public void print(ArrayList list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

