package com.simbirsoft.logparser.service;

import com.simbirsoft.logparser.domain.Log;

import java.nio.file.Path;
import java.util.List;

public interface LogService {

    /**
     * Парсинг и сохранение файла с логами
     *
     * @param file файл с логами
     * @return список сохраненных в БД логов
     */
    List<Log> parseAndSave(Path file);
}
