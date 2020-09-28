package com.interview.lock;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author Jerry
 * @create 2020-07-08 16:21
 */
public class Mutex implements Lock {

    private static class Sync extends AbstractQueuedSynchronizer {
        protected Sync() {
            super();
        }

        @Override
        protected boolean tryAcquire(int arg) {
            if (compareAndSetState(0, 1)) {
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        @Override
        protected boolean tryRelease(int arg) {
            if (getState() == 0) {
                throw new IllegalArgumentException();
            }
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        /**
         * 是否处于独占状态
         *
         * @return
         */
        @Override
        protected boolean isHeldExclusively() {
            return getState() == 1;
        }

        Condition newCondition() {return new ConditionObject();}
    }

    private final Sync sync=new Sync();

    @Override
    public void lock() {
         sync.acquire(1);
    }

    @Override
    public void lockInterruptibly() throws InterruptedException {

    }

    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }

    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    @Override
    public void unlock() {
         sync.release(1);
    }

    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }
}
