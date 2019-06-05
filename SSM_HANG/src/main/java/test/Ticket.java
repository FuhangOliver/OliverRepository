package test;

public class Ticket implements Runnable//extends Thread
{
    private int num = 100;

    Object obj = new Object();

    public void run() {
        while (true) {
            synchronized (obj) {
                if (num > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                    }

                    System.out.println(Thread.currentThread().getName() + ".....sale...." + num--);
                }
            }
        }
    }
}
