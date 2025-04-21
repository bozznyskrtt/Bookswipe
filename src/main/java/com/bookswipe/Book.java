package com.bookswipe;

public class Book {
    private int bookID;
    private BookTemplate template;
    private Owner owner;
    private String bookCondition;
    private boolean isAvailable;
    private String availableFor;
    private Status status;

    public enum Status {
        AVAILABLE, SWIPED, MATCHED, INTRANSIT
    }

    public Book(int bookID, BookTemplate template, Owner owner, String bookCondition,
                boolean isAvailable, String availableFor, Status status) {
        this.bookID = bookID;
        this.template = template;
        this.owner = owner;
        this.bookCondition = bookCondition;
        this.isAvailable = isAvailable;
        this.availableFor = availableFor;
        this.status = status;
    }

    public Owner getOwner() {
        return owner;
    }

    public BookTemplate getTemplate() {
        return template;
    }

    public String getBookCondition() {
        return bookCondition;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getAvailableFor() {
        return availableFor;
    }

    public Status getStatus() {
        return status;
    }

    public int getBookID() {
        return bookID;
    }
}