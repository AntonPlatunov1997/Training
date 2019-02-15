package com.ebook.controller;

import com.ebook.model.Model;
import com.ebook.view.View;

import java.util.Scanner;

    public class Controller {
        private Model model;
        private View view;
        Scanner sc = new Scanner(System.in);

        public Controller(Model model, View view) {
            this.model = model;
            this.view = view;
        }

        public void processUser() {
            start();
            view.print(model.getList());


        }

        public void start(){
            System.out.println("Введите имя");
            checkData(Regex.NAME);
            System.out.println("Введите surname");
            checkData(Regex.SUR_NAME);
            System.out.println("Введите Email");
            checkData(Regex.EMAIL);
            System.out.println("Введите password");
            checkData(Regex.PASSWORD);


        }

       public void checkData(String regex){
            checkDataWords(regex);




        }

public void checkDataWords(String regex){
          String res=sc.nextLine();
    while (true){
        if (!res.matches(regex)){
            System.out.println("Wrong");
            res =sc.nextLine();
        }else {
            System.out.println("Cool");
            model.fillList(res);
            break;
        }

    }

}


    }

