package step.service;

import step.model.Project;

import java.util.List;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public interface ProjectService {

    /**
     * @return projects.
     */
    Project getProject();

    /**
     * @return list of projects.
     */
    List<Project> getProjects();

    /**
     * @param id is projects id.
     * @return {@link Project} entity by given id.
     */
    Project getByID(Long id);
}
