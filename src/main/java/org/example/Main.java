package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> machine = new ArrayList<Product>();
        LoadUp.loadUp(machine);
        DisplayProducts.displayProducts(machine);

    }
}