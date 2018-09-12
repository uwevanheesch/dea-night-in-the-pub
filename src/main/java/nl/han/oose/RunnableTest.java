package nl.han.oose;

public class RunnableTest implements Runnable {

    private String name;

    public RunnableTest(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.name + ": " + i);
        }
    }
}
