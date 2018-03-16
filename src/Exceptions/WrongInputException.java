package Exceptions;

public class WrongInputException extends Exception{
    WrongInputException (){
        super();
    }

    WrongInputException (String message){
        super(message);
    }

    WrongInputException (String message, Throwable cause){
        super(message, cause);
    }
}