package Day01;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private int yearOfPremier;
    private List<Actor> actors = new ArrayList<>();

    public Movie(String title, int yearOfPremier) {
        this.title = title;
        this.yearOfPremier = yearOfPremier;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPremier() {
        return yearOfPremier;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    public int actorsInTheirTwenties() {
        int count = 0;
        for (int i = 0; i < actors.size(); i++) {
            if ((yearOfPremier - actors.get(i).getYearOfBirth()) >= 20) {
                if ((yearOfPremier - actors.get(i).getYearOfBirth()) < 30) {
                    count++;
                }
            }
        }
        return count;
    }
// konzultációs megoldás. Majdhogynem kötelező a for each ciklus! Elegánsabb, hatékonyabb, olvashatóbb!
//
//    public int actorsInTheirTwenties() {
//        int count = 0;
//
//        for (Actor actual : actors) {
//            int age = yearOfPremier - actual.getYearOfBirth(); // új változó, hogy ne kelljen annyit gépelni...
//            if (age >= 20 && age < 30) {
//                count++;
//            }
//        }
//        return count;
//    }
}
