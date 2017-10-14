package step.model;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Viktor Bilko on 28.08.2017.
 */
@Builder
@Getter
public class Instructor extends AbstractEntity {

    private String name;
    private String surname;
    private String technology;
    private String email;
    private String password;
}
