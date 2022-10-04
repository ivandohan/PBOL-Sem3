package K3a;

public class Dog extends Pet {
    public static String fetch() {
        return "Yes, master. Fetch i will.";
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        System.out.println(myDog.fetch());
        System.out.println(myDog.speak());
        System.out.println(myDog.getName());
    }
}
