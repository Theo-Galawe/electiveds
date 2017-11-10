/**
 * @(#)classArray.java
 *
 *
 * @author
 * @version 1.00 2017/11/8
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassArrayList {




    public static void main(String[] args) {
        laptop L1 = new laptop();
        L1.setipadress(5);
        L1.setmodel("HP");

        laptop L2 = new laptop();
        L2.setipadress(6);
        L2.setmodel("Acer");

        laptop L3 = new laptop();
        L3.setipadress(7);
        L3.setmodel("Lenovo");

        laptop L4 = new laptop();
        L4.setipadress(8);
        L4.setmodel("Mac");

        List bagAllowingDuplicates = new ArrayList();
        bagAllowingDuplicates.add(L1);
        bagAllowingDuplicates.add(L2);
        bagAllowingDuplicates.add(L3);
        bagAllowingDuplicates.add(L4);

        System.out.println("The number of items in the List is "+bagAllowingDuplicates.size());


        Set nodupsbag = new HashSet();
        nodupsbag.add(L1);
        nodupsbag.add(L2);
        nodupsbag.add(L3);
        nodupsbag.add(L4);

        System.out.println("The number of Items in the Set is  "+nodupsbag.size());

    }


}