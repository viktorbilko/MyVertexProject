package step.service.impl;

import step.model.Instructor;
import step.model.Project;
import step.service.EmailService;
import step.service.email.Email;
import step.service.email.EmailCongratulatory;
import step.service.email.EmailType;
import step.service.email.EmailInformation;
import step.service.email.exception.NoDestinatinationException;
import step.service.email.exception.NoEmptyException;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public class EmailServiceImpl implements EmailService {
    /**
     * {@inheritDoc}.
     */
    @Override
    public Email getEmailType(EmailType emailType) {
        switch (emailType) {
            case INFORMATION_LETTER:
                new EmailInformation();
                break;
            case CONGRATULATORY_LETTER:
                new EmailCongratulatory();
                break;
            default:
                System.out.println("Invalid email type");
        }
        return null;
    }

    /**
     * {@inheritDoc}.
     */
    @Override
    public void send(Project project, Email email) {
        try {
            check(project.getInstructor());
            check(project.getInstructor().getEmail());
            email.sendMessage(email.buildMessage(project), project.getInstructor().getEmail());
        } catch (NoEmptyException e){
            e.printStackTrace();
        } catch (NoDestinatinationException e){
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e.getClass().getSimpleName());
        }
    }

    @Override
    public void check(Instructor instructor) throws NoDestinatinationException {
        if (null == instructor) {
            throw new NoDestinatinationException();
        }
    }

    @Override
    public void check(String string) throws NoEmptyException {
        if ("".equals(string)) {
            throw new NoEmptyException();
        }
    }
}