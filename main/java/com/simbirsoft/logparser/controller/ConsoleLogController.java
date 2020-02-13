package com.simbirsoft.logparser.controller;

import com.simbirsoft.logparser.domain.Log;
import com.simbirsoft.logparser.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.*;
import java.nio.file.Path;
import java.sql.Date;
import java.text.SimpleDateFormat;

@Component
public class ConsoleLogController {

    private LogService logService;

    @Autowired
    public ConsoleLogController(LogService logService) {
        this.logService = logService;
    }
    //Парсинг файла
    private Log parserLog(String line){
        Log log = new Log();
        //Обновление устаревшего знака на новый
        line = line.replace("  ", " ");
        String[] str= line.split(" ");
        for (int i = 0; i < str.length; i++) {
            switch (i)
            {
                case 0:
                    break;
                case 1:
                    try {
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
                        String buf = str[i-1].toString() + " " + str[i].toString();
                        Date parsedDate = (Date) dateFormat.parse(buf);
                        log.setTimeStamp(new java.sql.Timestamp(parsedDate.getTime()));
                    } catch(Exception e) { }
                    break;
                case 2: log.setThread(str[i].toString());
                break;
                case 3: log.setLevel(str[i].toString());
                break;
                default:
                    log.setMessage(str[i].toString() + " ");
                    break;
            }
        }
        return log;
    }

    /**
     * Парсинг файла и сохранение логов в БД
     *
     * @param logFile файл с логами
     */
    public void saveLogs(Path logFile) {
        BufferedReader  reader;
    Log log;
        try {
            reader = new BufferedReader(new FileReader(String.valueOf(logFile)));
            String line = reader.readLine();
            while (line != null) {
                line = reader.readLine();
                log = parserLog(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
