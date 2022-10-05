package K3a;

public class Cat extends Pet {
    public static String speak() {
        return "Don't give me orders.\n" +
                "I speak only when I want to";
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();

        myCat.setName("Gary");
        System.out.println(myCat.speak());
        System.out.println(myCat.getName());
        myCat.eating();

    }
}
