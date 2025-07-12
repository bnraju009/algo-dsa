package com.util;

import java.util.Arrays;
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        ThreadDemo threadDemo = new ThreadDemo();
        Future<?> status= executorService.submit(threadDemo);
        System.out.println("status = " + status.isDone());
        System.out.println("status.state().toString() = " + status.state().toString());
        if(status.isDone() || status.state().toString()=="SUCCESS"){
            System.out.println("*********Success*****");
        }

    }
    static class ThreadDemo<T> implements Runnable{
        @Override
        public void run() {
            System.out.println("Calling from runnable");
        }
    }
    static class DirectExecutor implements Executor {
        public void execute(Runnable r) {
            r.run();
        }
    }
}
