package step.database;

import step.model.Instructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Imitation database for {@link Instructor} entity.
 *
 * @author Viktor Bilko on 03.09.2017.
 */
public class InstructorData {

    public static Instructor getInstructor(){
        Instructor instructor = new Instructor();
        instructor.setName("Alex");
        instructor.setSurname("Smith");
        instructor.setTechnology("Java");
        instructor.setEmail("alex.smith@gmail.com");

        return instructor;
    }

    public static List<Instructor> getInstructors(){
        Instructor alex = new Instructor();
        alex.setName("Alex");
        alex.setSurname("Smith");
        alex.setTechnology("Java");
        alex.setEmail("alex.smith@gmail.com");

        Instructor bob = new Instructor();
        bob.setName("Bob");
        bob.setSurname("Smith");
        bob.setTechnology("Java");
        bob.setEmail("bob.smith@gmail.com");

        Instructor tom = new Instructor();
        tom.setName("Tom");
        tom.setSurname("Smith");
        tom.setTechnology("Java");
        tom.setEmail("tom.smith@gmail.com");

        List instructorsList = new ArrayList();
        instructorsList.add(alex);
        instructorsList.add(bob);
        instructorsList.add(tom);

        return instructorsList;
    }
}