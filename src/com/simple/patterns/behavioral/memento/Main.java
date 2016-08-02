package com.simple.patterns.behavioral.memento;

public class Main {

    public static void main(String[] args) {
        final ClientStatus clientStatus = new ClientStatus(Status.INITIAL);
        clientStatus.changeStatus(Status.IN_PROGRESS);
        clientStatus.changeStatus(Status.FINISHED);
        clientStatus.changeStatus(Status.CLOSED);
        clientStatus.getHistoricStatus().stream().forEach(System.out::println);
    }
}
