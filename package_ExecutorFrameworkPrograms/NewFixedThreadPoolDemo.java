package package_ExecutorFrameworkPrograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NewFixedThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executor;

        System.out.println("Largest Executions : " + pool.getLargestPoolSize());

        System.out.println("Maximum Allowes Threads : " + pool.getMaximumPoolSize());

        System.out.println("Current Threads in Pool : " + pool.getPoolSize());

        System.out.println("Currently Executing Threads : " + pool.getActiveCount());

        System.out.println("Total Number Of Threads (Ever Scheduleed) : " + pool.getTaskCount());

        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());
        executor.submit(new Task());

        System.out.println("Core Threads : " + pool.getCorePoolSize());
        System.out.println("Largest Executions : " + pool.getLargestPoolSize());
        System.out.println("Maximum Allowes Threads : " + pool.getMaximumPoolSize());
        System.out.println("Current Threads in Pool : " + pool.getPoolSize());
        System.out.println("Currently Executing Threads : " + pool.getActiveCount());
        System.out.println("Total Number Of Threads (Ever Scheduleed) : " + pool.getTaskCount());

        executor.shutdown();
    }

    static class Task implements Runnable {

        public void run() {
            try {
                Long duration = (long) (Math.random() * 10);
                System.out.println("Running Task! Thread Name : " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(duration);
                System.out.println("Task Completed! Thread Name : " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
