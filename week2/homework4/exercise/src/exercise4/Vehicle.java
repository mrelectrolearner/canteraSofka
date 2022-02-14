package exercise4;

import java.util.Arrays;
import java.util.Calendar;

public class Vehicle {
    private final int passangersNumber;
    private final boolean thereAreCrew;
    private final int wheelesNumber;
    private final Calendar registerDate;
    private final String travelMeans;
    private double[] position;
    private double[] velocity;

    public Vehicle(
            int passangersNumber,
            boolean thereAreCrew,
            int wheelesNumber,
            Calendar registerDate,
            String travelMeans) {
        this.passangersNumber = passangersNumber;
        this.thereAreCrew = thereAreCrew;
        this.wheelesNumber = wheelesNumber;
        this.registerDate = registerDate;
        this.travelMeans = travelMeans;
        this.position = new double[3];
        this.velocity = new double[3];
    }

    private double[] addArray(double [] array1, double[] array2){
        double [] sum=new double[3];
        for (int index=0; index<array1.length; index++) {
            sum[index]=array1[index]+array2[index];
        }
        return sum;
    }

    public double[] move(double[] distance){
        return this.addArray(this.getPosition(),distance);
    }

    public double[] speedup(double[] acceleration){
        return this.addArray(this.getVelocity(), acceleration);
    }

    public int getPassangersNumber() {
        return passangersNumber;
    }

    public boolean isThereAreCrew() {
        return thereAreCrew;
    }

    public int getWheelesNumber() {
        return wheelesNumber;
    }

    public Calendar getRegisterDate() {
        return registerDate;
    }

    public String getTravelMeans() {
        return travelMeans;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public void setVelocity(double[] velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passangersNumber=" + passangersNumber +
                ", thereAreCrew=" + thereAreCrew +
                ", wheelesNumber=" + wheelesNumber +
                ", registerDate=" +  + registerDate.get(Calendar.DAY_OF_MONTH)+"/"
                + registerDate.get(Calendar.MONTH)+"/"+ registerDate.get(Calendar.YEAR)+
                ", travelMeans='" + travelMeans + '\'' +
                ", position=" + Arrays.toString(position) +
                ", velocity=" + Arrays.toString(velocity) +
                '}';
    }
}
