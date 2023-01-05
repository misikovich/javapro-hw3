public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.run(24);
        cat.swim(939);

        dog.run(888);
        dog.swim(1024);

        cat = new Cat("Stepan");
        dog = new Dog("Patron");

        cat.run(24);
        cat.swim(939);

        dog.run(888);
        dog.swim(1024);
    }
}