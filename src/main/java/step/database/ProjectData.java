package step.database;

import step.model.Instructor;
import step.model.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * Imitation database for {@link Project} entity.
 *
 * @author Viktor Bilko on 28.08.2017.
 */
public class ProjectData {

    public static List<Project> getProjets(){
        Project javaStart = new Project();
        javaStart.setId(1);
        javaStart.setTechnology("Java Start");
        javaStart.setStartDate("01.09.2017");
        javaStart.setPrice(500);
        javaStart.setInstructor(InstructorData.getInstructor());

        Project javaOOP = new Project();
        javaOOP.setId(2);
        javaOOP.setTechnology("Java OOP");
        javaOOP.setStartDate("02.09.2017");
        javaOOP.setPrice(1000);
        javaOOP.setInstructor(InstructorData.getInstructor());

        Project javaProfessional = new Project();
        javaProfessional.setId(2);
        javaProfessional.setTechnology("Java Professional");
        javaProfessional.setStartDate("03.09.2017");
        javaProfessional.setPrice(1500);
        javaProfessional.setInstructor(InstructorData.getInstructor());

        List<Project> projectsList = new ArrayList<>();
        projectsList.add(javaStart);
        projectsList.add(javaOOP);
        projectsList.add(javaProfessional);

        return projectsList;
    }
}
