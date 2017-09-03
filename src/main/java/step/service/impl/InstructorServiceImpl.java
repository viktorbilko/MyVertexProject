package step.service.impl;

import step.dao.InstructorDao;
import step.dao.factory.DaoFactory;
import step.model.Instructor;
import step.service.InstructorServise;
import step.service.factory.ServiceFactory;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class InstructorServiceImpl implements InstructorServise {
    /**
     * @param email
     * @return Instructor.
     */
    @Override
    public Instructor getInstructorByEmail(String email) {
        InstructorDao instructorDao = DaoFactory.getInstructorDao();
        return instructorDao.getInstructorByEmail(email);
    }
}
