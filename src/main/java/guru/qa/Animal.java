package guru.qa;

public class Animal {

    String name;
    String color;
    int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void sayHi() {
        System.out.println("Meow!");
    }

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

}