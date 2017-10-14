package step.model;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Viktor Bilko on 28.08.2017.
 */
@Builder
@Getter
public class Project extends AbstractEntity {

    private String technology;
    private String startDate;
    private int price;
    private Instructor instructor;
}
