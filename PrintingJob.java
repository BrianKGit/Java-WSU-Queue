/*
 * Author:      Brian Klein
 * Date:        11/29/17
 * Program:     PrintingJob.java
 * Description: User-defined class with three private data members: pid, 
                userName, and docName. Constructors, Getters and Setters, and 
                toString method.
 */

public class PrintingJob {
    
    //variables
    private String userName, docName;
    private int pid;
    
    //constructors

    public PrintingJob() {
    }

    public PrintingJob(int pid, String userName, String docName) {
        this.pid = pid;
        this.userName = userName;
        this.docName = docName;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    @Override
    public String toString() {
        return  "[" + pid + ", " + userName + 
                ", " + docName + "]";
    }

}