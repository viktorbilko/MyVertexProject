package step.service.email;

import lombok.NonNull;
import step.model.Instructor;
import step.model.Project;
import step.service.EmailService;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class EmailInformation implements Email {

    @Override
    public String buildMessage(@NonNull Instructor instructor) {
        return "Instructor - " + instructor.getName()
                + " "
                + instructor.getSurname()
                + "\n"
                + "technology "
                + instructor.getTechnology();
    }

    @Override
    public String buildMessage(Project project) {
        return "Project - " + project.getTechnology()
                            + "\n"
                            + "start: "
                            + project.getStartDate()
                            + "\n"
                            + project.getPrice();
    }

    @Override
    public void sendMessage(String message, String email) {
        System.out.println(message);
        System.out.println(email);
    }
}
