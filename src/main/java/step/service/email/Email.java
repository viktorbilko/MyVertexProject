package step.service.email;

import step.model.Instructor;
import step.model.Project;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public interface Email {

    String buildMessage(Instructor instructor);

    String buildMessage(Project project);

    void sendMessage(String message, String email);
}
