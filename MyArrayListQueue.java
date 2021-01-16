
import java.util.ArrayList;

public class MyArrayListQueue<E> implements QueueInterface<E> {

  private ArrayList<E> q;
  
  //private int front, rear;
  
  //constructor
  public MyArrayListQueue() {
     
     q = new ArrayList<E>();
     
  }
  
  public int size() {
     return q.size();
  }
  
  public boolean isEmpty() {
     return (size() == 0);
  }
  
  public void enqueue( E obj ) {
     q.add( obj );
  }
  
  public E dequeue() throws EmptyQueueException {
     if(isEmpty())
        throw new EmptyQueueException("\nQueue is empty.");
        
     return q.remove(0);
  }
  
  public E front() throws EmptyQueueException {
     if(isEmpty())
        throw new EmptyQueueException("\nQueue is empty.");
     
     return q.get(0);
  }
  
  public String toString() {
  
     return "" + q;
  }

}

