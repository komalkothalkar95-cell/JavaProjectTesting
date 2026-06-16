package exceptionStudy;

public class InvalidAgeAccountException extends RuntimeException{
    public InvalidAgeAccountException(String msg)
    {
        super(msg);
    }
}
