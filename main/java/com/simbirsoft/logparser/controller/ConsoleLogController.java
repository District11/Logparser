package com.simbirsoft.logparser.controller;

import com.simbirsoft.logparser.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Path;

@Component
public class ConsoleLogController {

    private LogService logService;

    @Autowired
    public ConsoleLogController(LogService logService) {
        this.logService = logService;
    }

    /**
     * Парсинг файла и сохранение логов в БД
     *
     * @param logFile файл с логами
     */
    public void saveLogs(Path logFile) {

    }
}
