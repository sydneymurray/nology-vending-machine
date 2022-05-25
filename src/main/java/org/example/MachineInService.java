package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MachineInService {
    public static void inService(ArrayList<Product> machine) {
        Scanner keyboardInput = new Scanner(System.in);

        while (true) {
            DisplayProducts.displayProducts(machine);
            System.out.println("Please select a product: ");
            String selection = keyboardInput.nextLine();
            BuyProduct.buyProduct(Integer.parseInt(selection), machine);
        }
    }
}

/*


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}

*/
