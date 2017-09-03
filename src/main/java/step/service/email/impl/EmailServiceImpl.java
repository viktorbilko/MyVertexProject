package step.service.email.impl;

import step.model.Project;
import step.service.EmailService;
import step.service.email.EmailCongratulatory;
import step.service.email.EmailType;
import step.service.email.EmailInformation;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public class EmailServiceImpl implements EmailService {

    /**
     * {@inheritDoc}.
     */
    @Override
    public void send(Project project, EmailType emailType) {
        switch (emailType) {
            case INFORMATIONMAIL:
                new EmailInformation(project);
                break;
            case CONGRATULATORYLETTER:
                new EmailCongratulatory(project);
                break;
            default:
                System.out.println("Invalid email type");
        }
    }
}
