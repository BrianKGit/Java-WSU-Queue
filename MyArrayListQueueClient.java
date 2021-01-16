public class MyArrayListQueueClient {

   public static void main(String[] args) {
   
      MyArrayListQueue<String> customerQ = new MyArrayListQueue<String>();
      
      customerQ.enqueue( "Tom" );
      customerQ.enqueue( "Mary" );
      customerQ.enqueue( "Ben" );
      
      System.out.println("Customer Queue: " + customerQ);
      
      try {
         System.out.println("Front Customer: " + customerQ.front() );
      } 
      catch (EmptyQueueException e) {
         System.out.println(e);
      }
      
      try {
         System.out.println(customerQ.dequeue() + " is being served.");
      } 
      catch(EmptyQueueException e) {
         System.out.println(e);
      }
      
      System.out.println("Customer Queue: " + customerQ);
      
      try{
         System.out.println("Front Customer: " + customerQ.front() );
      }
      catch (EmptyQueueException e) {
         System.out.println(e);
      }
      
   }
}

