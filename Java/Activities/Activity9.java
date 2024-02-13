package activities;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity9 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        //Add elements to array
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
        myList.add("Item 4");
        myList.add("Item 5");

        System.out.println("Display Array list");
        for(String item:myList) {
            System.out.println( item);
        }

        System.out.println("Retrieve 3rd element "+myList.get(2));

        if(myList.contains("Item 4")){
            System.out.println("Item exist");
        }

        System.out.println("Print size of array "+myList.size());

        //Remove element
        myList.remove("Item 2");

        System.out.println("Print size of array after remove "+myList.size());


    }

}
