@SuppressWarnings("unchecked")

public class MyArrayQueue<E> implements QueueInterface<E> {

   public static final int CAPACITY = 12;
   
   private int capacity, front, rear;
   
   private E[] q;

   //constructors
   public MyArrayQueue() {
      this(CAPACITY);
   }
   
   public MyArrayQueue( int n ) {
   
      capacity = n;
      
      //q = new E [capacity];
      q = (E[]) new Object[capacity];
      
      front = rear = 0;
      
   }
   
   public int size() {
      return (capacity - front + rear) % capacity;
   }
   
   public boolean isEmpty() {
      //return (size() == 0);
      return (front == rear);
   }
   
   public void enqueue( E obj ) throws FullQueueException {
   
      if( size() == capacity - 1 ) //cannot hold more than n-1 objects
         throw new FullQueueException("\nQueue Overflow.");
         
      q[rear] = obj;
      
      rear = (rear + 1) % capacity;
   
   }
   
   public E dequeue() throws EmptyQueueException {
   
      if(isEmpty())
         throw new EmptyQueueException("Empty Queue.");
      
      E temp = q[front];
      
      q[front] = null;
   
      front = (front + 1) % capacity;
      
      return temp;
      
   }
   
   public E front() throws EmptyQueueException {
      
      if(isEmpty())
         throw new EmptyQueueException("Empty Queue.");
      
      return q[front];
   
   }
   
   public String toString() {
      String result = "[";
      
      int temp = front;
      int i = size();
      
      while( i > 0 ) {
         
         result += " " + q[temp];
         temp = (temp + 1) % capacity;
         i--;
      }
      
      return result + "]";
   }
   
}