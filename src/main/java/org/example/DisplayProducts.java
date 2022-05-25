package org.example;

import java.util.ArrayList;

public class DisplayProducts {
    public static void displayProducts(ArrayList<Product> machine){
        System.out.println("Please select a product");
        for (Product product : machine) {
            System.out.println(product.getId() + " "
            + product.getName() + " "
            + product.getCategory() + " "
            + product.getPrice()+"p");
        }
    }
}
