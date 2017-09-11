package step.database;

import lombok.NonNull;
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
        Instructor instructor = Instructor.builder()
                .name("Alex")
                .surname("Smith")
                .technology("Java")
                .email("alex.smith@gmail.com")
                .build();

        return instructor;
    }

    public static List<Instructor> getInstructors(){
        Instructor alex = Instructor.builder()
                .name("Alex")
                .surname("Smith")
                .technology("Java")
                .email("alex.smith@gmail.com")
                .build();

        Instructor bob = Instructor.builder()
                .name("Bob")
                .surname("Smith")
                .technology("Java")
                .email("bob.smith@gmail.com")
                .build();

        Instructor tom = Instructor.builder()
                .name("Tom")
                .surname("Smith")
                .technology("Java")
                .email("tom.smith@gmail.com")
                .build();

        List instructorsList = new ArrayList();
        instructorsList.add(alex);
        instructorsList.add(bob);
        instructorsList.add(tom);

        return instructorsList;
    }
}