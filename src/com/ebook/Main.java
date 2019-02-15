package com.ebook;

import com.ebook.controller.Controller;
import com.ebook.model.Model;
import com.ebook.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model, new View());
        controller.processUser();
    }
}
