package Exceptions;

public class CannotMoveException extends Exception{
    CannotMoveException (){
        super();
    }

    CannotMoveException (String message){
        super(message);
    }

    CannotMoveException (String message, Throwable cause){
        super(message, cause);
    }
}
