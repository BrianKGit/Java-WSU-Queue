
import java.util.*;

public class RepeatingKeyEncryption {

   public static void main(String[] args) {
   
      String message = "Knowledge is power.";
      
      int [] keyValues = {6, 7, 3, 1, 8};
      
      String encodedMessage, decodedMessage;
      
      encodedMessage = encrypt( message, keyValues );
      decodedMessage = decrypt( message, keyValues );
      
      
      System.out.println("Original message: " + message);
      System.out.println("Encoded message: " + encodedMessage);
      System.out.println("Decoded message: " + decodedMessage);
      
   }//end main
   
   public static String encrypt( String message, int [] key ) {
   
      String encodedMessage = "";
      
      int keyValue;
      
      //use ArrayListQueue
      //MyArrayListQueue<Integer> keyQueue = new MyArrayListQueue<Integer>();
      
      //use Java collection queue
      Queue<Integer> keyQueue = new LinkedList<Integer>();
      
      //load the queue
      for( int i=0; i<key.length; i++) {  
         keyQueue.add(key[i]); //add is enqueue
      }
         
      //encrypt the message
      for( int i=0; i<message.length(); i++) {
         
         //remove the key value from the queue
         keyValue = keyQueue.remove(); //remove is dequeue
         
         encodedMessage += (char)(message.charAt(i) + keyValue);
         
         //add the key value to the queue
         keyQueue.add( keyValue );
      }
      
      return encodedMessage;
   }
   
   public static String decrypt( String message, int [] key ) {
   
      String decodedMessage = "";
      
      int keyValue;
      
      //use ArrayListQueue
      //MyArrayListQueue<Integer> keyQueue = new MyArrayListQueue<Integer>();
      
      //use Java collection queue
      Queue<Integer> keyQueue = new LinkedList<Integer>();
      
      //load the queue
      for( int i=0; i<key.length; i++) {  
         keyQueue.add(key[i]); //add is enqueue
      }
         
      //encrypt the message
      for( int i=0; i<message.length(); i++) {
         
         //remove the key value from the queue
         keyValue = keyQueue.remove(); //remove is dequeue
         
         decodedMessage += (char)(message.charAt(i) - keyValue);
         
         //add the key value to the queue
         keyQueue.add( keyValue );
      }
      
      return decodedMessage;
   }
   
}

