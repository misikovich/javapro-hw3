public class Dog extends Animals implements AnimalActionable {

    public Dog(String name) {
        super(name);
        this.maxRunDist = 500;
        this.maxSwimDist = 10;
    }

    public Dog() {
        super("Бобік");
    }

    @Override
    public void Run(int distance) {
        if (distance > maxRunDist) {
            distance = maxRunDist;
        }
        System.out.printf("Собака %s пробіг %s метрів%n", this.name, distance);
    }

    @Override
    public void Swim(int distance) {
        if (distance > maxSwimDist) {
            distance = maxSwimDist;
        }
        System.out.printf("Собака %s проплив %s метрів%n", this.name, distance);
    }
}
