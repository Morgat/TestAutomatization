package gorovyi.calculator;

public class NegativeSqrtException extends RuntimeException{

    public NegativeSqrtException(){
        super("You can’t get a sqrt from a negative number!");
    }
}
