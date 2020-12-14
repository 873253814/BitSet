package main;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MyStream {
    List<String> list = new ArrayList<>();

    Map<Integer, Integer> map = new HashMap<>();

    ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void myForEach(Consumer<String> consume){
        list.add("g");
        list.add("h");
        list.add("i");
        list.stream().forEach(consume);
        System.out.println();
    }

    public void walk(BiConsumer<Integer, Integer> consumer){
        map.put(1,3);
        map.put(2,4);
        map.forEach(consumer);
    }

    public void testRun(Runnable run){
        lock.writeLock().lock();
        try {
            run.run();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.writeLock().unlock();
        }

    }
}
