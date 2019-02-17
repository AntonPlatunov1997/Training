package com.ebook.controller;

import com.ebook.model.Model;
import com.ebook.view.Messages;
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



        }

        public void start(){
            view.print(Messages.NAME_MESSAGE);
            checkData(Regex.NAME);
            view.print(Messages.SURNAME_MESSAGE);
            checkData(Regex.SURNAME);
            view.print(Messages.EMAIL_MESSAGE);
            checkData(Regex.EMAIL);
            view.print(Messages.PASSWORD_MESSAGE);
            checkData(Regex.PASSWORD);
            model.sendDataToNote();



        }

       public void checkData(String regex){
           String res=sc.nextLine();
           while (true){
               if (!res.matches(regex)){
                   view.print(Messages.WRONG_INPUT_DATA);
                   res =sc.nextLine();
               }else {

                   model.fillList(res);
                   break;
               }
           }
        }
    }

