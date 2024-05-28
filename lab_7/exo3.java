import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class exo3 {
    public static void main(String[] args) {
        // Declare and Initialize Sets
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(10);
        integerSet.add(20);

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("apple");
        stringSet.add("banana");
        stringSet.add("cherry");
        stringSet.add("apple");
        stringSet.add("banana");

        // Manipulate Sets
        integerSet.add(20); // Adding duplicate element
        stringSet.add("banana"); // Adding duplicate element

        integerSet.remove(10); // Removing specific element
        stringSet.remove("cherry"); // Removing specific element

        // Traverse Sets
        System.out.println("Integer Set:");
        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }

        System.out.println("String Set:");
        Iterator<String> stringIterator = stringSet.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }

        // Explore Set Implementations
        System.out.println("HashSet Contents: " + integerSet);
        System.out.println("TreeSet Contents: " + stringSet);

        TreeSet<String> treeSet = (TreeSet<String>) stringSet;
        System.out.println("First Element in TreeSet: " + treeSet.first());
        System.out.println("Last Element in TreeSet: " + treeSet.last());
    }
}