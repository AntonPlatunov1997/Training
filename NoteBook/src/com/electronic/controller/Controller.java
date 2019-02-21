package com.electronic.controller;

import com.electronic.model.Model;
import com.electronic.view.View;

public class Controller {
private Model model;
private View view;
private UtilityController utilityController;

    public Controller(Model model, View view, UtilityController utilityController) {
        this.model = model;
        this.view = view;
        this.utilityController = utilityController;
    }

    public void start (){
processUser();

   }

   public void processUser(){
utilityController.fillFildsNote();

   }

}
