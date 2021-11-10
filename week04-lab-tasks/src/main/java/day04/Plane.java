package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxPassanger;
    private List<Passanger> passangerList = new ArrayList<>();

    public Plane(int maxPassanger) {
        this.maxPassanger = maxPassanger;
    }

    public int getMaxPassanger() {
        return maxPassanger;
    }

    public List<Passanger> getPassangerList() {
        return passangerList;
    }

    public boolean addPassanger(Passanger passanger) {

        if (passangerList.size() < maxPassanger) {
            passangerList.add(passanger);
            return true;
        } else {                // fölös az else
            return false;
        }
    }

    public int numberOfPackages() {
        int packagesAmount = 0;
        for (Passanger passanger : passangerList) {
            packagesAmount += passanger.getPackageAmount();
        }
        return packagesAmount;
    }
}
