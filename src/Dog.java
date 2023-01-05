public class Dog extends Animal {

    public Dog(String name) {
        super(name);
        this.maxRunDist = 500;
        this.maxSwimDist = 10;
    }

    public Dog() {
        super("Бобік");
    }


    public void run(int distance) {
        distance = clipFunc(maxRunDist, distance);
        System.out.printf("Собака %s пробіг %s метрів%n", this.name, distance);
    }

    public void swim(int distance) {
        distance = clipFunc(maxSwimDist, distance);
        System.out.printf("Собака %s проплив %s метрів%n", this.name, distance);
    }
}
