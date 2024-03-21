// Create a class called InvalidTaskException that is a sub class of Exception
public class InvalidTaskException extends Exception{
    /* The no-arg constructor should invoke super with the 
       following message: "Task cannot be empty." */
       public InvalidTaskException() {
        super("Task cannot be empty.");
       }

    /* The overload constructor should accept task as an 
       argument and invoke super with the following message:
       "[task] is illegal, dangerous, or impossible." */
       public InvalidTaskException(String task) {
        super(task + " is illegal, dangerous, or impossible.");
       }
}