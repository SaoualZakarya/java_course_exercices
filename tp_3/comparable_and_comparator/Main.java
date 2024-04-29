public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Bob", 30);

        // Compare persons based on age
        int result = person1.compareTo(person2);

        if (result < 0) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else if (result > 0) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are the same age");
        }
    }
}
