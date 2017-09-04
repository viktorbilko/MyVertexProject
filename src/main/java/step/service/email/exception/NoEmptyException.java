package step.service.email.exception;

/**
 * Created by BilkoVV on 04.09.2017.
 */
public class NoEmptyException extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("No Empty");
    }
}
