package com.varsity.messageapp;

public class MessageRecord {
    public String id;
    public String cellNumber;
    public String message;
    public String hash;
    public String status;

    public MessageRecord(String id, String cellNumber, String message, String hash, String status) {
        this.id = id;
        this.cellNumber = cellNumber;
        this.message = message;
        this.hash = hash;
        this.status = status;
    }
}
