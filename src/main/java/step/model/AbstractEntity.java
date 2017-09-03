package step.model;

/**
 * @author Viktor Bilko on 03.09.2017.
 */
public abstract class AbstractEntity {

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
