public abstract class Animal {
    protected final String name;
    protected int maxRunDist;
    protected int maxSwimDist;
    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    protected int clipFunc(int max, int value) {
        return Math.min(value, max);
    }
}
