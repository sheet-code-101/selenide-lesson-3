package guru.qa;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("Sharik", "Gray", 5);

        System.out.println("This is a "
                + cat.name + "! The age is "
                + cat.age + ". And the color is "
                + cat.color.toLowerCase(Locale.ROOT) + ".");

        System.out.println("What does the cat say?");
        cat.sayHi();

        System.out.println("Alterating our " + cat.name + "...");
        cat.setColor("yellow");
        cat.setAge(7);
        cat.setName("Pikachu");

        String name = cat.getName();
        int age = cat.getAge();
        String color = cat.getColor();

        System.out.println("Well now it is a "
                + name + ". The age is "
                + age + ". And the color now is "
                + color + ".");

        System.out.println("lesson-3-new-branch_first_commit");
        System.out.println("lesson-3-new-branch_second_commit");
        System.out.println("lesson-3-new-branch_third_commit");
        System.out.println("lesson-3-new-branch_4th_commit");

    }

}
