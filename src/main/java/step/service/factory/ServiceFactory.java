package step.service.factory;

import step.model.Project;
import step.service.EmailService;
import step.service.InstructorServise;
import step.service.ProjectService;
import step.service.email.impl.EmailServiceImpl;
import step.service.impl.InstructorServiceImpl;
import step.service.impl.ProjectServiceImpl;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class ServiceFactory {

    public static ProjectService getProjectService(){
        return new ProjectServiceImpl();
    }

    public static InstructorServise getInstructorServise(){
        return new InstructorServiceImpl();
    }

    public static EmailService getEmailService(){
        return new EmailServiceImpl();
    }
}
