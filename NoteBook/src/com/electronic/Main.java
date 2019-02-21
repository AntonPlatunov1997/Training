package com.electronic;

import com.electronic.controller.Controller;
import com.electronic.controller.UtilityController;
import com.electronic.model.Model;
import com.electronic.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(),new View(),new UtilityController());
        controller.start();
    }
}
