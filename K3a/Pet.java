package K3a;

public class Pet {
    private static String name;

    public static void setName(String petName) {
        name = petName;
    }

    public static String getName() {
        return name;
    }

    public static void eating() {
        System.out.println("Nyam nyam");
    }

    public static String speak() {
        return "I'm your cuddly little pet.";
    }

}
