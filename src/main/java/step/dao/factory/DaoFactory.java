package step.dao.factory;

import step.dao.InstructorDao;
import step.dao.ProjectDao;
import step.dao.impl.InstructorDaoImpl;
import step.dao.impl.ProjectDaoImpl;
import step.model.Project;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class DaoFactory {

    /**
     * @return instance of {@link ProjectDao}.
     */
    public static ProjectDao getProjectDao(){
        return new ProjectDaoImpl();
    }

    /**
     * @return instance of {@link InstructorDao}.
     */
    public static InstructorDao getInstructorDao(){
        return new InstructorDaoImpl();
    }
}
