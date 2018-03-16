package Exceptions;

public class StopGameException extends Exception{
    StopGameException (){
        super();
    }

    StopGameException (String message){
        super(message);
    }

    StopGameException (String message, Throwable cause){
        super(message, cause);
    }
}
