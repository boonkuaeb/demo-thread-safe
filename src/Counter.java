import java.util.concurrent.atomic.AtomicInteger;

class Counter
{
    int count;

    AtomicInteger atomicCount  = new AtomicInteger();

    public void atomicIncrement()
    {
        atomicCount.incrementAndGet();
    }

    public  void increment()
    {
        count++;  // 100+1
    }

    public synchronized void syncIncrement()
    {
        count++;  // 100+1
    }
}