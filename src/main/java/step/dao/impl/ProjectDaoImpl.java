package step.dao.impl;

import step.dao.ProjectDao;
import step.database.ProjectData;
import step.model.Project;

import java.util.List;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public class ProjectDaoImpl implements ProjectDao {

    /**
     * {@inheritDoc}
     */
    public Project getProject() {
        return null;
    }

    /**
     * {@inheritDoc}
     */
    public List<Project> getProjects() {
        return ProjectData.getProjets();
    }

    /**
     * {@inheritDoc}
     */
    public Project getByID(Long id) {
        Project project = Project.builder()
                .technology("Java")
                .price(500)
                .build();
        return project;
    }

    @Override
    public Project update(Project project) {
        return null;
    }
}
