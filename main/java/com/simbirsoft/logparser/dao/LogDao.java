package com.simbirsoft.logparser.dao;

import com.simbirsoft.logparser.domain.Log;

import java.util.List;

public interface LogDao {

    /**
     * Вытащить все записи из базы данных
     *
     * @return список записей
     */
    List<Log> findAll();

    /**
     * Выполнение вставки в таблицу логов
     *
     * @param log сформированный готовый объект для вставки
     */
    void insert(Log log);

    /**
     * Множественная вставка в таблицу логов
     *
     * @param logs логи которые необходимо отправить в БД
     */
    void insertAll(List<Log> logs);
}
