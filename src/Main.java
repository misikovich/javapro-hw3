public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.Run(24);
        cat.Swim(939);

        dog.Run(888);
        dog.Swim(1024);

        cat = new Cat("Stepan");
        dog = new Dog("Patron");

        cat.Run(24);
        cat.Swim(939);

        dog.Run(888);
        dog.Swim(1024);
    }
}