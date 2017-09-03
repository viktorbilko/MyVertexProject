package step.dao.impl;

import step.dao.InstructorDao;
import step.database.InstructorData;
import step.model.Instructor;
import step.model.Project;

import java.util.List;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public class InstructorDaoImpl implements InstructorDao {
    /**
     * @param email
     * @return Instructor.
     */
    @Override
    public Instructor getInstructorByEmail(String email) {
        List<Instructor> instructors = InstructorData.getInstructors();

        for (Instructor instructor : instructors) {
            System.out.println(instructor.getTechnology());
            if (instructor.getEmail().equals(email)) {
                return instructor;
            }
        }

        return null;
    }
}
