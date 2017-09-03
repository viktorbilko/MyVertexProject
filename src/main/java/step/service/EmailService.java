package step.service;

import step.model.Instructor;
import step.model.Project;
import step.service.email.EmailType;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public interface EmailService {

    /**
     * @param project
     * @param emailType
     */
    void send(Project project, EmailType emailType);
}
