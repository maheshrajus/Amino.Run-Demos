/*
 * Stub for class hw.demo.bankaccount
 * Generated by Sapphire Compiler (sc).
 */
package hw.demo.stubs;


import sapphire.policy.transaction.TransactionExecutionException;

public final class bankaccount_Stub extends hw.demo.bankaccount implements sapphire.common.AppObjectStub {

    sapphire.policy.SapphirePolicy.SapphireClientPolicy $__client = null;
    boolean $__directInvocation = false;

    public bankaccount_Stub () {
        super();
    }


    public void $__initialize(sapphire.policy.SapphirePolicy.SapphireClientPolicy client) {
        $__client = client;
    }

    public void $__initialize(boolean directInvocation) {
        $__directInvocation = directInvocation;
    }

    public Object $__clone() throws CloneNotSupportedException {
        return super.clone();
    }



    // Implementation of vote(UUID)
    public sapphire.policy.transaction.TransactionManager.Vote vote(java.util.UUID $param_UUID_1)
            throws TransactionExecutionException {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.vote( $param_UUID_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public sapphire.policy.transaction.TransactionManager$Vote hw.demo.bankaccount.vote(java.util.UUID) throws sapphire.policy.transaction.TransactionExecutionException";
                $__params.add($param_UUID_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            throw new TransactionExecutionException("tx exec error", e);
        }
        return ((sapphire.policy.transaction.TransactionManager.Vote) $__result);
    }

    // Implementation of leave(UUID)
    public void leave(java.util.UUID $param_UUID_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.leave( $param_UUID_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.leave(java.util.UUID)";
                $__params.add($param_UUID_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of join(UUID)
    public void join(java.util.UUID $param_UUID_1)
            throws sapphire.policy.serializability.TransactionAlreadyStartedException {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.join( $param_UUID_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.join(java.util.UUID) throws sapphire.policy.serializability.TransactionAlreadyStartedException";
                $__params.add($param_UUID_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of getBalance()
    public int getBalance() {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                $__result = super.getBalance();
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public int hw.demo.bankaccount.getBalance()";
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ((java.lang.Integer) $__result).intValue();
    }

    // Implementation of debit(int)
    public void debit(int $param_int_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.debit( $param_int_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.debit(int)";
                $__params.add($param_int_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of credit(int)
    public void credit(int $param_int_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.credit( $param_int_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.credit(int)";
                $__params.add($param_int_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of commit(UUID)
    public void commit(java.util.UUID $param_UUID_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.commit( $param_UUID_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.commit(java.util.UUID)";
                $__params.add($param_UUID_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Implementation of abort(UUID)
    public void abort(java.util.UUID $param_UUID_1) {
        java.lang.Object $__result = null;
        try {
            if ($__directInvocation)
                super.abort( $param_UUID_1);
            else {
                java.util.ArrayList<Object> $__params = new java.util.ArrayList<Object>();
                String $__method = "public void hw.demo.bankaccount.abort(java.util.UUID)";
                $__params.add($param_UUID_1);
                $__result = $__client.onRPC($__method, $__params);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}