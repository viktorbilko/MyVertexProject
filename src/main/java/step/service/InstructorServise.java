package step.service;

import step.model.Instructor;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public interface InstructorServise {

    /**
     * @param email
     * @return Instructor.
     */
    Instructor getInstructorByEmail(String email);
}
