package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        // Create an object that will make a Pyramid (see Pyramid.java for more info)
        Pyramid.Output();
        // Create an object that implements a method which will take an name, age, and favorite color and will return a story (see Adlibs.java for more info)
        System.out.println(Adlibs.story("Brendan", 19, "blue"));
        // Create an object that implements a method which will  accept a string, an integer, and a char and will replace the char in the string at the given integer (See Replace.java for more info)
        System.out.println(Replace.charReplace("I MAKE BREAD", 2, 'T'));

    }
}
