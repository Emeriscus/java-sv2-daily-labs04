package day01;

public class MovieMain {
    public static void main(String[] args) {

        Movie movie = new Movie("Ponyvaregény", 1994);

        Actor actor01 = new Actor("Uma Thurman", 1976);
        Actor actor02 = new Actor("Bruce Willis", 1970);
        Actor actor03 = new Actor("samuel L. Jackson", 1974);
        Actor actor04 = new Actor("Quentin Tarantino", 1954);

        movie.addActor(actor01);
        movie.addActor(actor02);
        movie.addActor(actor03);
        movie.addActor(actor04);

        System.out.println(movie.actorsInTheirTwenties() + " szereplő járt a 20-as éveiben");

    }



}
