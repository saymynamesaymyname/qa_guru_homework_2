package guru.qa;

public class First {
    public static void main(String[] args) {
        Cat redCat = new Cat("рыжий", "персидский", 3);
        Cat blackCat = new Cat("чёрный", "беспородный", 10);

        redCat.printColorAndBreed();
        redCat.printHumanAge();

        blackCat.printColorAndBreed();
        blackCat.printHumanAge();
    }
}
