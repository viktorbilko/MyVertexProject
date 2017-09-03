package step.service.impl;

import step.dao.ProjectDao;
import step.dao.factory.DaoFactory;
import step.model.Project;
import step.service.ProjectService;
import step.service.factory.ServiceFactory;

import java.util.List;

/**
 * @author Viktor Bilko on 29.08.2017.
 */
public class ProjectServiceImpl implements ProjectService {

    /**
     * {@inheritDoc}.
     */
    public Project getProject() {
        ProjectDao projectDao = DaoFactory.getProjectDao();
        return projectDao.getProject();
    }

    /**
     * {@inheritDoc}.
     */
    public List<Project> getProjects() {
        ProjectDao projectDao = DaoFactory.getProjectDao();
        return projectDao.getProjects();
    }

    /**
     * {@inheritDoc}.
     */
    public Project getByID(Long id) {
        ProjectDao projectDao = DaoFactory.getProjectDao();
        return projectDao.getByID(id);
    }
}
