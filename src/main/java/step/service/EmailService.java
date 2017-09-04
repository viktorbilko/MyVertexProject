package step.service;

import step.model.Instructor;
import step.model.Project;
import step.service.email.Email;
import step.service.email.EmailType;
import step.service.email.exception.NoDestinatinationException;
import step.service.email.exception.NoEmptyException;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public interface EmailService {


    /**
     * @return emailType
     */
    Email getEmailType(EmailType emailType);
    /**
     * @param project
     * @param email
     */
    void send(Project project, Email email);

    void check(Instructor instructor) throws NoDestinatinationException;

    void check(String message) throws NoEmptyException;
}
