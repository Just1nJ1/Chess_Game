package Exceptions;

public class CannotMoveException extends Exception{
    public CannotMoveException (){
        super();
    }

    public CannotMoveException (String message){
        super(message);
    }

    public CannotMoveException (String message, Throwable cause){
        super(message, cause);
    }
}
