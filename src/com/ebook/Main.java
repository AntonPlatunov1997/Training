package com.ebook;

import com.ebook.controller.Controller;

import com.ebook.model.Model;
import com.ebook.view.View;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller(new Model(), new View());
        controller.processUser();
    }
}
