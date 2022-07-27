package guru.qa;

public class Cat {
    String color;
    String breed;
    int age;

    public Cat(String color, String breed, int age) {
        this.color = color;
        this.breed = breed;
        this.age = age;
    }
    void tellColorAndBreed() {
        System.out.println("Цвет кошака: " + color + ". Порода кошака: " + breed + "." );
    }

    void tellHumanAge() {
        System.out.println("Возраст кошака в пересчёте на человеческий: " + age*7 + ".");
    }
}
