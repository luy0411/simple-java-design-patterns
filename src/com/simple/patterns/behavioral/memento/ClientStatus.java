package com.simple.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class ClientStatus {

    private List<HistoricStatus> historicStatus;
    private Status status;

    public ClientStatus(Status status) {
        this.historicStatus = new ArrayList<>();
        changeStatus(status);
    }

    public List<HistoricStatus> getHistoricStatus() {
        return historicStatus;
    }

    public Status getStatus() {
        return status;
    }

    public void changeStatus(final Status status){
        this.status = status;
        historicStatus.add(new HistoricStatus(status));
    }
}
