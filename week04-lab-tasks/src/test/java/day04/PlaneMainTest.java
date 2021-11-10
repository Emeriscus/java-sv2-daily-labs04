package day04;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneMainTest {

    Plane plane = new Plane(3);

    @BeforeEach
    void init(){
        plane.addPassanger(new Passanger("Pisti", "564545", 2));
        plane.addPassanger(new Passanger("Pali", "444445", 3));
        plane.addPassanger(new Passanger("Józsi", "511145", 4));
        plane.addPassanger(new Passanger("Béla", "111111", 2));
    }


    @Test
    void addPassenger() {
        assertEquals(3, plane.getPassangerList().size());
        assertNotEquals(4, plane.getPassangerList().size());
        assertNotEquals(2, plane.getPassangerList().size());
        assertFalse(plane.addPassanger(new Passanger("fd", "ef", 3)));
    }

    @Test
    void numberOfPackages() {
        assertEquals(9, plane.numberOfPackages());
        assertNotEquals(8, plane.numberOfPackages());
    }

}
