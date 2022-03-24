package StackAndQueue.StackQueue2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLL<E> {
    private final LinkedList<E> queueList;
    //constructor
    public QueueLL() {
        queueList = new LinkedList<E>();
    }
    // add object to queue
    public void tambahData(E object) {
        queueList.add(object);
    }
    // remove object from queue
    public E hapusData() throws NoSuchElementException {
        return queueList.remove();
    }
    // determine if queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
    // output queue contents
    public void printQueue() {
        Iterator<E> iterator = queueList.iterator();
        while (iterator.hasNext()) {
            Object value = iterator.next();
            System.out.println("-" + value);
        }
    }
}
