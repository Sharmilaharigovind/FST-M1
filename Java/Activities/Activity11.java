package activities;


import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Item1");
        hash_map.put(2, "Item2");
        hash_map.put(3, "Item3");
        hash_map.put(4, "Item4");
        hash_map.put(5, "Item5");

        System.out.println("Print  map: " + hash_map);


        hash_map.remove(2);
        System.out.println("Remove Item2: " + hash_map);

        if(hash_map.containsValue("Item3")) {
            System.out.println("Item3 exists in the Map");
        } else {
            System.out.println("Item3 does not exist in the Map");
        }

        System.out.println("Number of pairs in the Map is: " + hash_map.size());
    }
}
