package com.zl.spring.worker.service;

import com.zl.spring.worker.Task;
import com.zl.spring.worker.TaskExecuteService;

public class MySimpleWorker extends TaskExecuteService {

    @Override
    protected void execute(Task task) {
        LOGGER.info("task:{},任务执行。。。",task);
    }
}
