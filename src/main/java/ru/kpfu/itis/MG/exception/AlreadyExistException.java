package ru.kpfu.itis.MG.exception;

public class AlreadyExistException extends Exception {

    public AlreadyExistException(){
        super();
    }

    public AlreadyExistException(String s){
        super(s);
    }
}
