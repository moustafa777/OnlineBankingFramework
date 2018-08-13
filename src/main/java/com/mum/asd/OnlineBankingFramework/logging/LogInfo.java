package com.mum.asd.OnlineBankingFramework.logging;

import java.time.LocalTime;

public class LogInfo {
    private long Id;
    private String Message;
    private String sender;
    private String Receiver;
    private LocalTime Datetime;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return Receiver;
    }

    public void setReceiver(String receiver) {
        Receiver = receiver;
    }

    public LocalTime getDatetime() {
        return Datetime;
    }

    public void setDatetime(LocalTime datetime) {
        Datetime = datetime;
    }


}
