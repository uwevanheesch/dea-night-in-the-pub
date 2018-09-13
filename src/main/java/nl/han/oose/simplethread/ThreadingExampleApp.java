package nl.han.oose.simplethread;

public class ThreadingExampleApp {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable("Thread1"));
        Thread thread2 = new Thread(new MyRunnable("Thread2"));
        thread.start();
        thread2.start();

        for (int i = 0; i < 10000; i++) {
            System.out.println("Main: " + i);
        }

        System.out.println("Main method ends");
    }

}
