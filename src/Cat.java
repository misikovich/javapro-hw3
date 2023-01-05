public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        this.maxRunDist = 200;
        this.maxSwimDist = 0;
    }

    public Cat() {
        super("Барсік");
    }

    public void run(int distance) {
        distance = clipFunc(maxRunDist, distance);
        System.out.printf("Кіт %s пробіг %s метрів%n", this.name, distance);
    }

    public void swim(int distance) {
        System.out.println("Коти не вміють плавати((((");
    }
}
