package com.zl.spring.worker;

public class Task {

    private long tid;

    public long getTid() {
        return tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Task{");
        sb.append("\"tid\":")
                .append(tid);

        sb.append('}');
        return sb.toString();
    }
}
