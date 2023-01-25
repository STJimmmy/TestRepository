package Threads37;


import Threads36.ThreadPlaygroundRunnable;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        for (int i =0; i<10; i++){
            executor.execute(new ThreadPlaygroundRunnable("TPR: " + i));
        }
    }
}
