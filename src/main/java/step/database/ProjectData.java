package step.database;

import lombok.val;
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
        Project javaStart = Project.builder()
                .technology("Java Start")
                .startDate("01.09.2017")
                .price(500)
                .instructor(InstructorData.getInstructor())
                .build();
        javaStart.setId(1);

        Project javaOOP = Project.builder()
                .technology("Java OOP")
                .startDate("02.09.2017")
                .price(1000)
                .instructor(InstructorData.getInstructor())
                .build();
        javaOOP.setId(2);

        Project javaProfessional = Project.builder()
                .technology("Java Professional")
                .startDate("03.09.2017")
                .price(1500)
                .instructor(InstructorData.getInstructor())
                .build();
        javaProfessional.setId(3);

        List<Project> projectsList = new ArrayList<>();
        projectsList.add(javaStart);
        projectsList.add(javaOOP);
        projectsList.add(javaProfessional);

        return projectsList;
    }
}
