package com.simple.patterns.structural.facade;

public class ServicesFacade {

    private PaymentProcess paymentProcess;
    private BillingProcess billingProcess;
    private MessagingProcess messagingProcess;

    public ServicesFacade() {
        this.billingProcess = new BillingProcess();
        this.messagingProcess = new MessagingProcess();
        this.paymentProcess = new PaymentProcess();
    }

    public void doTheWholeThing(){
        this.billingProcess.doSomething();
        this.messagingProcess.doSomething();
        this.paymentProcess.doSomething();
    }
}
