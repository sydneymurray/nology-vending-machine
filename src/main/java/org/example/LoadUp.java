package org.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;

public class LoadUp {
    static Random randomIntQuantity = new Random();
    public static void LoadUp(ArrayList<Product> machine){
        machine.add(new Product(1, "Nut", "Cereal Bar", randomIntQuantity.nextInt(21),  80));
        machine.add(new Product(2, "Mars", "Candy Bar", randomIntQuantity.nextInt(21),  70));
        machine.add(new Product(3, "Whole Nut", "Chocolate Bar", randomIntQuantity.nextInt(21),  60));
        machine.add(new Product(4, "Bacon Slices", "Crisp", randomIntQuantity.nextInt(21),  50));
        machine.add(new Product(5, "Salt & Vinegar", "Crisp", randomIntQuantity.nextInt(21),  50));
        machine.add(new Product(6, "Cheese & Onion", "Crisp", randomIntQuantity.nextInt(21),  50));
        machine.add(new Product(8, "Coke", "Soda", randomIntQuantity.nextInt(21),  100));
        machine.add(new Product(9, "Diet Coke", "Soda", randomIntQuantity.nextInt(21),  100));
        machine.add(new Product(10, "Orange", "Fruit Juice", randomIntQuantity.nextInt(21),  110));
        machine.add(new Product(11, "Pineapple", "Fruit Juice", randomIntQuantity.nextInt(21),  110));
        machine.add(new Product(12, "Salted Cashews", "Nuts", randomIntQuantity.nextInt(21),  140));
        machine.add(new Product(13, "Salted Peanuts", "Nuts", randomIntQuantity.nextInt(21),  130));
        machine.add(new Product(14, "Dry Roasted Peanuts", "Nuts", randomIntQuantity.nextInt(21),  130));
    }
    public static void LoadUpFromDataFile(ArrayList<Product> machine){
        String productFilePath = "./src/main/resources/ProductData.csv";
        String dataLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(productFilePath));
            while(true){
                dataLine = br.readLine();
                if (dataLine == null) return;
                String[] itemProperties = dataLine.split(",");
                machine.add(new Product(Integer.parseInt(itemProperties[0]),
                        itemProperties[1],
                        itemProperties[2],
                        randomIntQuantity.nextInt(21),
                        Integer.parseInt(itemProperties[4])));
            }
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
