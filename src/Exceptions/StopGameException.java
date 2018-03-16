package Exceptions;

public class StopGameException extends Exception{
    public StopGameException (){
        super();
    }

    public StopGameException (String message){
        super(message);
    }

    public StopGameException (String message, Throwable cause){
        super(message, cause);
    }
}
