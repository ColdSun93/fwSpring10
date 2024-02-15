package ru.coldsun.homework10.exception;

public class NoteNotFoundException extends RuntimeException{

    public NoteNotFoundException(String message) {
        super(message);
    }
}
