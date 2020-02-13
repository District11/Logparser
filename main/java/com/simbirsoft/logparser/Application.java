package com.simbirsoft.logparser;

import com.simbirsoft.logparser.controller.ConsoleLogController;
import com.simbirsoft.logparser.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.nio.file.Path;

public class Application {

    public static void main(String[] args) {
        Path filePath = handleFilePath(args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        ConsoleLogController logController = context.getBean(ConsoleLogController.class);
        logController.saveLogs(filePath);

        context.close();
    }

    /**
     * Обработка аргумента командной строки
     * Валидация пути к файлу с логами
     *
     * @param args аргументы командной строки
     * @return валидный файл или Exception
     */
    private static Path handleFilePath(String[] args) {
        return null;
    }
}
