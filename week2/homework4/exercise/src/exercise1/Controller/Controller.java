package exercise1.Controller;

import exercise1.Model.Planet;
import exercise1.Model.SolarSystem;
import exercise1.Model.Sun;

/**
 * Represent a controller that create the solar system with the sun and some planets.
 * @version 1.0.0 2022-02-15.
 * @author Luis Felipe Rivas -luisfelorivas@gmail.com
 * @since 1.0.0 2022-02-15.
 */

public class Controller {
    /**
     * Create a solar system adding tree planets and a Sun.
     * @author Luis Felipe Rivas-luisfelorivas@gmail.com.
     * @since 1.0.0 2022-02-15.
     * @return  a solar system.
     */
    public static SolarSystem createSolarSystem(){
        SolarSystem solarSystem=new SolarSystem();
        Planet planet1=new Planet(3.302E23,5.43,"Mercury",2439.64,57909175);
        Planet planet2=new Planet(4.869E24,5.24,"Venus",6051,108208930);
        Planet planet3=new Planet(59742E24,5.515,"Earth",6378.15,149597870);
        solarSystem.addPlanet(planet1);
        solarSystem.addPlanet(planet2);
        solarSystem.addPlanet(planet3);
        Sun sun=new Sun(1.99E30,1410000,"Sun",6.96E5);
        solarSystem.setSun(sun);
        return solarSystem;
    }
}
