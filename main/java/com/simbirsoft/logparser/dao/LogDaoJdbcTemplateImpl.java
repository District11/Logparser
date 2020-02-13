package com.simbirsoft.logparser.dao;

import com.simbirsoft.logparser.domain.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LogDaoJdbcTemplateImpl implements LogDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public LogDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Log> findAll() {
        return null;
    }

    @Override
    public void insert(Log log) {


    }

    @Override
    public void insertAll(List<Log> logs) {

    }
}
