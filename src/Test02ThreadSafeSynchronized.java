
public class Test02ThreadSafeSynchronized {

    public static void main(String[] args) throws Exception {
        Counter c = new Counter();


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1; i <= 1000; i++) {
                    c.syncIncrement();
                    //     System.out.println("thread 1 <<<"+c.count);
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1; i <= 1000; i++) {
                    c.syncIncrement();
                    //  System.out.println("thread 2 <<<"+c.count);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();



        System.out.println("final value >>>> "+c.count);
    }
}
