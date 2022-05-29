package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortProducts {
    public static void sortByCategoryThenName(ArrayList<Product> machine){
        machine.sort(new Comparator() {
            public int compare(Object o1, Object o2) {
                String x1 = ((Product) o1).getCategory();
                String x2 = ((Product) o2).getCategory();
                int sComp = x1.compareTo(x2);

                if (sComp != 0) {
                    return sComp;
                }

                String y1 = ((Product) o1).getName();
                String y2 = ((Product) o2).getName();
                return y1.compareTo(y2);
            }
        });
    }
}
