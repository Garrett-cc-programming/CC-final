import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Astronaut{

    String name;
    StringBuilder results = new StringBuilder();

      public Astronaut(String name){
        this.name = name;
      }

       public String getName(){
        return this.name;
       }

       public void performTask(String task) throws InvalidTaskException{
      
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

       public String getResults(){
        return results.toString();
       }

      private boolean isValid(String task) {
        String[] illegalTask = {"Access other craft without authorization", "Fire weapon", "Turn off life support", "Go for a jog", "Go lie down in bed", "Take a shower"};
        for (String illegalTasks : illegalTask) {
          if (task.equals(illegalTasks)) {
            return false;
          }
        } return true;
      }
}