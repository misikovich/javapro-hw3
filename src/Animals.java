interface AnimalActionable {

    void Run(int distance);

    void Swim(int distance);
}

public abstract class Animals {
    protected final String name;
    protected int maxRunDist;
    protected int maxSwimDist;
    public Animals(String name) {
        this.name = name;
    }
}
