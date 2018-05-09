package hw.demo;

import sapphire.app.SapphireObject;
import sapphire.policy.serializability.TransactionAlreadyStartedException;
import sapphire.policy.transaction.TransactionExecutionException;
import sapphire.policy.transaction.TransactionManager;
import sapphire.policy.transaction.TwoPCCohortPolicy;
import sapphire.policy.transaction.TwoPCExtResourceCohortPolicy;

import java.io.Serializable;
import java.util.UUID;

public class wallet implements SapphireObject<TwoPCExtResourceCohortPolicy>, TransactionManager {
    private int balance;

    public void credit(int amount) {
        this.balance += amount;
    }

    public void debit(int amount) throws Exception {
        if (this.balance < amount) {
            throw new Exception("insufficient fund");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return this.balance;
    }

    @Override
    public void join(UUID transactionId) throws TransactionAlreadyStartedException {
        System.out.println("[wallet] xa join");
    }

    @Override
    public void leave(UUID transactionId) {
        System.out.println("[wallet] xa leave");
    }

    @Override
    public Vote vote(UUID transactionId) throws TransactionExecutionException {
        System.out.println("[wallet] xa vote");
        return Vote.YES;
    }

    @Override
    public void commit(UUID transactionId) {
        System.out.println("[wallet] xa commit");
    }

    @Override
    public void abort(UUID transactionId) {
        System.out.println("[wallet] xa abort");
    }
}