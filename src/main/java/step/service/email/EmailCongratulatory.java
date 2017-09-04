package step.service.email;

import step.model.Instructor;
import step.model.Project;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class EmailCongratulatory implements Email {

    @Override
    public String buildMessage(Instructor instructor) {
            return "Instructor - " + instructor.getName()
                    + " "
                    + instructor.getSurname()
                    + "\n"
                    + "technology "
                    + instructor.getTechnology();
    }

    @Override
    public String buildMessage(Project project) {
        return "Congratulations to our " + "\n"
                                         + buildMessage(project.getInstructor());
    }

    @Override
    public void sendMessage(String message, String email) {
            System.out.println(message);
            System.out.println(email);
    }
}
