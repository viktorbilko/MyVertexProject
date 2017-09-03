package step.dao;

import step.model.Instructor;
import step.model.Project;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public interface InstructorDao {
    /**
     * @param email
     * @return Instructor.
     */
    Instructor getInstructorByEmail(String email);
}
