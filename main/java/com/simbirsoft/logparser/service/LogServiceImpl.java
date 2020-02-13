package com.simbirsoft.logparser.service;

import com.simbirsoft.logparser.dao.LogDao;
import com.simbirsoft.logparser.domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.util.List;

@Component
public class LogServiceImpl implements LogService {

    private LogDao logDao;

    @Autowired
    public LogServiceImpl(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public List<Log> parseAndSave(Path file) {
        return null;
    }
}
