package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> machine = new ArrayList<Product>();
        LoadUp.LoadUpFromCSVDataFile(machine);
        //LoadUp.LoadUp(machine);
        SortProducts.sortByCategoryThenName(machine);
        MachineInService.inService(machine);
    }
}
