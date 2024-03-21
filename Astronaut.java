// Create Astronaut class
public class Astronaut{
    // Attributes
    String name;
    StringBuilder results = new StringBuilder();
    /* The Astronaut constructor accepts name,
       assigns the local name to the attribute 
       name, and creates a new results object. */
      public Astronaut(String name){
        this.name = name;
      }
    /* The getName method accapts no arguments
       and returns the name as a String. */
       public String getName(){
        return this.name;
       }

    /* The performTask method accepts task, throws
       IllegalArgumentExceptions if the task is empty
       or adds the task to results if not */
       public void performTask(String task) throws InvalidTaskException{
      
        // For invalid tasks: "Task cannot be empty."
        // For valid tasks: "Task: [task]\n"
        if (task == null || task.isEmpty() || task == "") {
          throw new InvalidTaskException();
        }
        else{
          if(isValid(task)) {
            results.append("Task: ").append(task).append("\n");
          } else {
            throw new InvalidTaskException(task);
          }
        }
       }

    /* The getResults method accepts no arguments
       and returns the results as a string. */
       public String getResults(){
        return results.toString();
       }
    /* The isVaild method accepts task. It has two String
       arrays to check for illegalTasks and impossibleTasks. If 
       is a task is illegal, dangerous or impossible, this method
       should return false. Otherwise, it should return true. */ 
       // Invalid tasks: "Access other craft without authorization"
                      // "Fire weapon"
                      // "Turn off life support"
                      // "Go for a jog"
                      // "Go lie down in bed"
                      // "Take a shower"
      private boolean isValid(String task) {
        String[] illegalTask = {"Access other craft without authorization", "Fire weapon", "Turn off life support", "Go for a jog", "Go lie down in bed", "Take a shower"};
        for (String illegalTasks : illegalTask) {
          if (task.equals(illegalTasks)) {
            return false;
          }
        } return true;
      }
}