package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MachineInService {
    public static void inService(ArrayList<Product> machine) {
        Scanner keyboardInput = new Scanner(System.in);

        while (true) {
            DisplayProducts.displayProducts(machine);
            System.out.println("\n     Please select a product: ");
            String selection = keyboardInput.nextLine();
            BuyProduct.buyProduct(Integer.parseInt(selection), machine);
        }
    }
}

