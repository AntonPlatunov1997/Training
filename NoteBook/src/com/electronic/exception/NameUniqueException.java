package com.electronic.exception;

public class NameUniqueException extends Exception  {
    private String sameName;



    public   NameUniqueException(String name){
        super(name);
        sameName = name;
    }

    public String toString(){
        String s = "Name " + sameName + " is existed";
        return s;
    }

}
