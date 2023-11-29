package org.example;

import org.example.controller.CategoryController;
import org.example.utilty.DBConnection;

public class Main {
    public static void main(String[] args) {
        CategoryController controller= new CategoryController();
        controller.createCategory("bilgisayar");

    }
}