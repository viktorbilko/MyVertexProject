package step.controller;

import step.model.Project;
import step.service.EmailService;
import step.service.ProjectService;
import step.service.email.Email;
import step.service.email.EmailType;
import step.service.email.impl.EmailServiceImpl;
import step.service.factory.ServiceFactory;

import java.util.List;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class ProjectController {

    public static void main(String[] args) {
        ProjectService projectService = ServiceFactory.getProjectService();
        List<Project> projects = projectService.getProjects();

        for (Project project : projects) {
            System.out.println(project.getTechnology());
        }

        EmailService emailService = ServiceFactory.getEmailService();
        Email emailType = emailService.getEmailType(EmailType.CONGRATULATORYLETTER);
        emailService.send(projects.get(0), emailType);
    }
}
