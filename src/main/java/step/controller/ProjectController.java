package step.controller;

import step.model.Project;
import step.service.ProjectService;
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
    }
}
