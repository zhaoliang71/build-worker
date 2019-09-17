package com.zl.spring.worker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class TaskExecuteService implements TaskService {

    public static final Logger LOGGER = LoggerFactory.getLogger(TaskExecuteService.class);


    @Override
    public void execute() {
        long tid = System.nanoTime();
        if (LOGGER.isInfoEnabled()){
            LOGGER.info("tid:{},TaskExecuteService.execute start",tid);
        }
        Task task = new Task();
        task.setTid(tid);
        execute(task);
        if (LOGGER.isInfoEnabled()){
            LOGGER.info("tid:{},TaskExecuteService.execute end",tid);
        }
    }

    protected abstract void execute(Task task);
}
