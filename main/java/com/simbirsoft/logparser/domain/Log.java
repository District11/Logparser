package com.simbirsoft.logparser.domain;

import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class Log {

    /**
     * Уникальный идентификатор записи
     */
    private UUID id;

    /**
     * Дата создания лога
     */
    private Timestamp timeStamp;

    /**
     * Уровень логирования
     */
    private String level;

    /**
     * Из какого потока лог
     */
    private String thread;

    /**
     * Сообщение лога
     */
    private String message;

    public void setTimeStamp(Timestamp timestamp){
        this.timeStamp= timestamp;
    }
    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public  void  setLevel(String level){
        this.level= level;
    }
    public String getLevel() {
        return level;
    }

    public void setThread(String thread){
        this.thread= thread;
    }
    public String getThread() {
        return thread;
    }

    public  void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
