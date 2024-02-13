package activities;


import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("Item1");
        hs.add("Item2");
        hs.add("Item3");
        hs.add("Item4");
        hs.add("Item5");
        hs.add("Item6");

        //Print HashSet
        System.out.println("Original HashSet: " + hs);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());

        //Remove element
        System.out.println("Removing Item3 from HashSet: " + hs.remove("Item3"));
        //Remove element that is not present
        if(hs.remove("Item8")) {
            System.out.println("Item8 removed from the Set");
        } else {
            System.out.println("Item8 is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if Item1 is present: " + hs.contains("Item1"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}