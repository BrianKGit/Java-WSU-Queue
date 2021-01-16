/*
 * Author:      Brian Klein
 * Date:        11/29/17
 * Program:     EmptyStackException.java
 * Description: Handles EmptyQueueException.
 */

public class EmptyQueueException extends RuntimeException {

    public EmptyQueueException(String err) {
        super(err);
    }
}
