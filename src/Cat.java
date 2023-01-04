public class Cat extends Animals implements AnimalActionable {
    public Cat(String name) {
        super(name);
        this.maxRunDist = 200;
        this.maxSwimDist = 0;
    }

    public Cat() {
        super("Барсік");
    }

    @Override
    public void Run(int distance) {
        if (distance > maxRunDist) {
            distance = maxRunDist;
        }
        System.out.printf("Кіт %s пробіг %s метрів%n", this.name, distance);
    }

    @Override
    public void Swim(int distance) {
        System.out.println("Коти не вміють плавати((((");
    }
}
