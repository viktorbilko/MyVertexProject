package step.service.email;

import step.model.Instructor;
import step.model.Project;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class CongratulatoryLetter implements Email {

    public CongratulatoryLetter(Project project){
        sendMessage(buildMessage(project), project.getInstructor().getEmail());
    }

    @Override
    public String buildMessage(Instructor instructor) {
        return "Instructor - " + instructor.getName()
                               + " "
                               + instructor.getSurname()
                               + "technology "
                               + instructor.getTechnology();
    }

    @Override
    public String buildMessage(Project project) {
        return "Congratulations to our" + buildMessage(project.getInstructor());
    }

    @Override
    public void sendMessage(String message, String email) {
        System.out.println(message);
        System.out.println(email);
    }
}
