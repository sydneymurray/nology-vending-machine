package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyProduct {
    public static void buyProduct(int productID, ArrayList<Product> machine){
        Scanner keyboardInput = new Scanner(System.in);
        Product selectedProduct = null;
        for (Product item : machine) {
            if (item.getId() == productID) {
                selectedProduct = item;
            }
        }
        if(selectedProduct == null) return;
        if(selectedProduct.getQuantity() == 0) {
            System.out.println("Unfortunately, " + selectedProduct.getName() + " is SOLD OUT");
            return;
        }

        System.out.println("Please pay: " + selectedProduct.getPrice() + "p for " + selectedProduct.getName());
        String payment = keyboardInput.nextLine();
        if(Integer.parseInt(payment) < selectedProduct.getPrice()){
            System.out.println("Insufficient Payment: Returning your "+ payment + "p");
            return;
        }
        System.out.println("Payment received: Dispensing your "
                + selectedProduct.getName() + " " + selectedProduct.getCategory());
        if (selectedProduct.getPrice() < Integer.parseInt(payment))
            System.out.println("Please collect your change: "
                + (Integer.parseInt(payment) - selectedProduct.getPrice()) + "p");
        selectedProduct.soldItem();
    }
}
