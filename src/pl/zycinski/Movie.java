package pl.zycinski;

import java.util.*;

/**
 * @author Dominik Zycinski
 * @version 1.01, 24/03/2018
 * @see java.util
 * @since 5.0
 */


/**The class that represents Movie*/
public class Movie {

    /**Default constructor*/
    Movie(){};

    /**Mapa which have title of the film by key nad list of actors by values*/
    private static Map<String, List<Actor>> movies;

    static {
        Actor atkinson = new Actor("Rowan Atkinson", Gender.M);
        Actor bloom = new Actor("Orlando Bloom", Gender.M);
        Actor dennehy = new Actor("Brian Dennehy", Gender.M);
        Actor depp = new Actor("Johnny Depp", Gender.M);
        Actor firth = new Actor("Colin Firth", Gender.M);
        Actor fishburne = new Actor("Laurence Fishburne", Gender.M);
        Actor gibson = new Actor("Mel Gibson", Gender.M);
        Actor grant = new Actor("Hugh Grant", Gender.M);
        Actor hunt = new Actor("Helen Hunt", Gender.K);
        Actor keaton = new Actor("Diane Keaton", Gender.K);
        Actor knightley = new Actor("Keira Knightley", Gender.K);
        Actor linney = new Actor("Laura Linney", Gender.K);
        Actor mccutcheon = new Actor("Martine McCutcheon", Gender.K);
        Actor neeson = new Actor("Liam Neeson", Gender.M);
        Actor nicholson = new Actor("Jack Nicholson", Gender.M);
        Actor nighy = new Actor("Bill Nighy", Gender.M);
        Actor peet = new Actor("Amanda Peet", Gender.K);
        Actor reeves = new Actor("Keanu Reeves", Gender.M);
        Actor rickman = new Actor("Alan Rickman", Gender.M);
        Actor rush = new Actor("Geoffrey Rush", Gender.M);
        Actor stallone = new Actor("Sylvester Stallone", Gender.M);
        Actor thompson = new Actor("Emma Thompson", Gender.K);
        Actor tomei = new Actor("Marisa Tomei", Gender.K);
        movies = new HashMap<>();
        movies.put("Piraci z Karaibów", Arrays.asList(depp, rush, bloom, knightley));
        movies.put("Czego pragną kobiety", Arrays.asList(gibson, hunt, tomei));
        movies.put("To właśnie miłość", Arrays.asList(grant, neeson, firth, linney,
                thompson, rickman, knightley, mccutcheon, nighy, atkinson));
        movies.put("Lepiej późno niż później", Arrays.asList(nicholson, keaton, reeves, peet));
        movies.put("Matrix", Arrays.asList(reeves, fishburne));
        movies.put("Rambo. Pierwsza krew", Arrays.asList(stallone, dennehy));
    }

    /**Method writing the titles of films, and under each of them a list of actors.*/
    public static void filmLibrary() {


        for (String s : movies.keySet()) {
            System.out.println("\nW filmie pt. "+ s+  " grali:");
            Collections.sort( movies.get(s));
            for( Actor s2 : movies.get(s) )
                {
                    System.out.print(s2 );
                }
        }
    }
}