package com.simple.patterns.behavioral.memento;

import java.time.LocalDateTime;

public class HistoricStatus {

    private LocalDateTime dateTime;
    private Status status;

    public HistoricStatus(Status status) {
        this.dateTime = LocalDateTime.now();
        this.status = status;
    }

    @Override
    public String toString() {
        return "HistoricStatus{" +
                "dateTime=" + dateTime +
                ", status=" + status +
                '}';
    }
}
