package src.arrayExercises;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args){
        sortArrayList();
    }

    private static void sortArrayList() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");

        System.out.println(fruits);
        Collections.sort(fruits);
        System.out.println(fruits);
    }

    private static void loopArrayList() {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println(fruits);

        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
    }

    private static void removeArrayList() {

        //We use remove() to remove a element.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println(fruits.size());
        //We cam remove it by index and element.
        System.out.println(fruits.remove(2));
        System.out.println(fruits);
        System.out.println(fruits.size());
        System.out.println(fruits.remove("Banana"));
        System.out.println(fruits);
        System.out.println(fruits.size());

        //We use clear() to remove all element from array.
        fruits.clear();
        System.out.println(fruits);
        System.out.println(fruits.size());
    }

    private static void setArrayList() {

        //We use set() to make change from element.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println(fruits.set(1, "StrawBerry"));
        System.out.println(fruits);
    }

    private static void getArrayList() {

        //We use get() to get elements from arrayList.
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Mango");

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(3));
    }

    private static void addArrayList() {

        //We use add() to add elements in arrayList.
        ArrayList<Integer> ints = new ArrayList<>();
        //Adding elements
        ints.add(25);
        ints.add(83);
        ints.add(43);

        //Adding elements in specific index.
        ints.add(0, 1);
        ints.add(2, 71);

        System.out.println(ints);
    }
}
