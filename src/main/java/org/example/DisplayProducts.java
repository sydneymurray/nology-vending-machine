package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DisplayProducts {
    public static void displayProducts(List<Product> machine){
        //machine.sort(Comparator.comparing(Product::getCategory));
        System.out.println("\n");
        for (Product product : machine) {
            String quantity = formatString(String.valueOf(product.getQuantity()), 2, true) + " are in stock.";
            if(product.getQuantity() == 0) quantity = "   OUT OF STOCK.";
            System.out.println(formatString(String.valueOf(product.getId()), 3, true) + " "
                + formatString(product.getName(), 25, false)
                + formatString(product.getCategory(), 20, false) + "Price: "
                + formatString(String.valueOf(product.getPrice()),3, true) + "p, "
                + quantity);
        }
    }

    private static String formatString(String string, int length, boolean proceedOrSucceed){
        String spaces = "";
        for (int i = 0; i < length - string.length(); i++) spaces += " ";
        return proceedOrSucceed ? spaces + string : string + spaces;
    }
}

