/*
 * Author:      Brian Klein
 * Date:        11/29/17
 * Program:     PrintingJobQueue.java
 * Description: client program that can simulate the printing queue. Submit-
                (add a new printing job to the queue). Check Printer Queue-
                (output the printing jobs in the queue). Check Front Job-(output 
                the front printing job in the queue). Check Queue Size-(show the 
                number of jobs in the queue). Print Next Job-(remove and return 
                the front printing job in the queue). The empty queue exception 
                should be handled.
 */
import java.util.*;

public class PrintingJobClient {

    public static void main(String[] args) {

        Queue<PrintingJob> printerQ = new LinkedList<PrintingJob>();

        boolean flag = true;
        String userCommand;
        Scanner console = new Scanner(System.in);
        int pid = 1;

        while (flag) {

            displayMenu();

            userCommand = console.next();

            switch (userCommand) {
                case "1":
                    //add a new printing job to the queue
                    System.out.println("\nEnter User Name:");
                    String userName = console.next();

                    System.out.println("\nEnter Document Name:");
                    String docName = console.next();

                    PrintingJob job = new PrintingJob(pid, userName, docName);
                    printerQ.add(job);
                    pid++;

                    System.out.println("\n[" + job.toString() + "] has been added to queue.");

                    break;

                case "2":
                    try {
                        //output the printing jobs in queue
                        System.out.println(printerQ.toString());
                    } catch (EmptyQueueException e) {
                        System.out.println(e);
                    }

                    break;

                case "3":
                    try {
                        //output the front printing job in queue
                        System.out.println("The front job: [" + printerQ.peek() + "]");
                    } catch (EmptyQueueException e) {
                        System.out.println(e);
                    }

                    break;

                case "4":
                    try {
                        //show the number of jobs in the queue
                        System.out.println("The total number of jobs: " + printerQ.size());
                    } catch (EmptyQueueException e) {
                        System.out.println(e);
                    }

                    break;

                case "5":
                    try {
                        //remove and return the front printing job in the queue
                        if(printerQ.isEmpty()) {
                            System.out.println("The queue is empty.");
                        } else {
                        System.out.println("[" + printerQ.remove() + "] is sent for printing.");
                        }
                    } catch (EmptyQueueException e) {
                        System.out.println(e);
                    }

                    break;

                case "0":
                    flag = false;

                    System.out.println("Thank you for using this program.");

                    break;

                default:
                    System.out.println("Invalid command, try again.");

            }//end switch

        }//end while

    }//end main

    private static void displayMenu() {

        System.out.print("\n\n"
                + "1 -- Submit (add a new printing job to the queue).\n"
                + "2 -- Check Printer Queue (output the printing jobs in queue).\n"
                + "3 -- Check Front Job (output the front printing job in queue).\n"
                + "4 -- Check Queue Size (show the number of jobs in the queue).\n"
                + "5 -- Print Next Job (remove and return the front printing job in the queue).\n"
                + "0 -- Exit\n\n"
                + "Enter command:");

    }//end displayMenu
}//end class