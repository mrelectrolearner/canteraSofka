package taller2;

import taller2.Fuel;

public abstract class Spacecraft {
    private static float outOfEarth=1000000;
    private float speed;
    private float power;
    private String name;
    private float[] position;
    private String typeOfPropulsionSystem;
    public boolean state;
    private Fuel fuel ;

    public Spacecraft(float speed, float power, String name, String typeOfPropulsionSystem, Fuel fuel) {
        this.speed = speed;
        this.power = power;
        this.name = name;
        this.fuel = fuel;
        this.position = new float[]{0, 0, 0};
        this.typeOfPropulsionSystem = typeOfPropulsionSystem;
        this.state =false;

    }

    public abstract void land();
    public abstract void moveX(float distance);
    public abstract void moveY(float distance);
    public abstract void moveZ(float distance);
    public abstract void speedUp(float acceleration);

}
