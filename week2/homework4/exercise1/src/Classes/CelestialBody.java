package Classes;

public abstract class CelestialBody {
    private static int counter;
    private final double mass;
    private final double density;
    private final double name;
    private final int id;


    public CelestialBody(double mass, double density, double name, int id) {
        this.mass = mass;
        this.density = density;
        this.name = name;
        this.id = this.counter;
        this.counter+=1;
    }

    public abstract double gravitationalAttraction(Object Planet);
}
