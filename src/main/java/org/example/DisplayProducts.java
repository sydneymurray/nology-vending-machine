package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class DisplayProducts {
    public static void displayProducts(ArrayList<Product> machine){
        machine.sort(Comparator.comparing(Product::getCategory));
        System.out.println("\n");
        for (Product product : machine) {
            String quantity = product.getQuantity() + " are in stock.";
            if(product.getQuantity() == 0) quantity = "OUT OF STOCK.";
            System.out.println(product.getId() + " "
                + product.getName() + " "
                + product.getCategory() + ", Price: "
                + product.getPrice() + "p, "
                + quantity);
        }
    }
}

