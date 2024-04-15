package collections;

import entities.Course;
import entities.Student;
import util.DataReader;

import java.lang.reflect.Array;
import java.util.*;

public class PlayingWithCollections {

    public static void main(String[] args) {
      playWithLists();
      playWithSet();
      playWithMaps();
    }

    public static void playWithLists(){

        // Lav en LinkedList og en ArrayList med Student-objekter. Fyld dem op med objekter ved at kalde DataReader.fillWithStudents() med din liste

        // Tilføj et nyt Student-objekt objekt med metoden add() til hver af listerne.
        // Hvor i listerne tror du, det bliver tilføjet? Test din teori ved at printe listerne før og efter

        // Hvad sker der hvis vi tilføjer et nyt Student-objekt på index 3 i hver af listerne?
        // Prøv det af. Tænk over hvad du tror, der vil ske og print så ud for at se om du har ret

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?

    }

    public static void playWithSet(){
        // Lav et HashSet og et TreeSet med Student-objekter. Fyld det op ved at kalde DataReader.fillWithStudents() med dit sæt

        // Tilføj et nyt Student-objekt objekt med metoden add()

        // Hvor i settet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter

        // Hvad sker der hvis vi tilføjer to ens Student-objekter?

        // Ekstra - hvad vil det sige, at Student-objekterne er ens? Kan vi ændre på dette?

    }


    public static void playWithMaps(){

        // Lav et HashMap() med Student-objekter og Courses, hvor Student er key og Course er value
        // Fyld det op ved at kalde DataReader.fillWithStudentsAndCourses()

        // Tilføj et nyt Student-objekt/Course-objekt par med metoden put()

        // Hvor i mappet tror du, det bliver tilføjet? Test din teori ved at printe settet før og efter

        // Hvad sker der hvis vi tilføjer to Student/Course par hvor Student-objekterne er ens?

        // Og hvad sker der hvis vi tilføjer to Student/Course par hvor Course-objekterne er ens?
    }

}
