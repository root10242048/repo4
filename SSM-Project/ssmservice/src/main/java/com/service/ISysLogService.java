package com.service;

import com.domain.SysLog;

import java.util.List;

public interface ISysLogService {
    List<SysLog> findAll() throws Exception;
    public void save(SysLog log) throws Exception;
}
