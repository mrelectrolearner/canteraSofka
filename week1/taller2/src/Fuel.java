public class Fuel {
    private String name;
    private float autonomy;
    private float mass;
    private float volume;


    public Fuel(String name, float autonomy, float mass, float volume) {
        this.name = name;
        this.autonomy = autonomy;
        this.mass = mass;
        this.volume = volume;

    }
    public void fuelWaste(float wasteVolume){
        if(this.volume > wasteVolume) {
            this.volume -= wasteVolume;
        }else {
            System.out.println("There is not enough fuel");
        }
    }
    public void refuel(float volumeToRefuel,float tankCapacity){
        float totalRefuel=this.volume +volumeToRefuel;
        if(totalRefuel<tankCapacity){
            this.volume =this.volume +volumeToRefuel;
        }else{
            System.out.println("not allowed, the tank is full");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAutonomy() {
        return autonomy;
    }

    public void setAutonomy(float autonomy) {
        this.autonomy = autonomy;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }
}
