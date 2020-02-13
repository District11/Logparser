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
}
