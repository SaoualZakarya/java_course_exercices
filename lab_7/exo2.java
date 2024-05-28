import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;

public class exo2 {
    public static void main(String[] args) {

        // 1- Declaration and initialization of the collections 

        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("apple");
        stringList.add("banana");

        // Don't contain duplicated value
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);
        integerSet.add(20);

        // Pair key-value
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("apple", 1);
        stringIntegerMap.put("banana", 2);
        stringIntegerMap.put("cherry", 3);

        // 2- Manipulate Collections
        stringList.add("date");
        integerSet.add(30);
        stringIntegerMap.put("date", 4);

        // 3- Traverse Collections

        // Travers the list
        System.out.println("The first list");
        for (String element : stringList) {
            System.out.println(element);
        }

        System.out.println("The iterator traversed list");
        // Travers the set with the iterator
        Iterator<Integer> iterator = integerSet.iterator();
        // The iterator each time will have value of our list till the end
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("The map list");
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 4 - Perform Operations on Collections
        System.out.println("The sorted list alphabetically");
        Collections.sort(stringList);
        System.out.println(stringList);

        int sum = 0;
        for (int num : integerSet) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        if (stringIntegerMap.containsKey("cherry")) {
            System.out.println("Value of cherry: " + stringIntegerMap.get("cherry"));
        }

        // 5 - Example of using SortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("orange");
        sortedSet.add("apple");
        sortedSet.add("banana");
        sortedSet.add("kiwi");
        sortedSet.add("apple");  // Duplicate, will not be added

        System.out.println("The sorted set:");
        for (String element : sortedSet) {
            System.out.println(element);
        }

        // Additional operations with SortedSet
        System.out.println("First element: " + sortedSet.first());
        System.out.println("Last element: " + sortedSet.last());
        SortedSet<String> headSet = sortedSet.headSet("kiwi");
        System.out.println("HeadSet (elements less than 'kiwi'): " + headSet);
        SortedSet<String> tailSet = sortedSet.tailSet("banana");
        System.out.println("TailSet (elements greater than or equal to 'banana'): " + tailSet);
    }
}