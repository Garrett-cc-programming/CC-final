import java.util.Scanner;
public class GroundControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the astronaut: ");
        String astronautName = scanner.nextLine();

        
        Astronaut astronaut = new Astronaut(astronautName);
        System.out.println("Astronaut " + astronaut.getName() + " is ready for tasks.\n");
        

        
        while (true) {
            
            System.out.print("Enter a task for " + astronaut.getName() + " or 'done' to finish: ");
            String task = scanner.nextLine();
            
            if (task.equals("done")) {
                break;
            }

            try {
                astronaut.performTask(task);
                System.out.println("Task '" + task + "' added.");
            } catch (InvalidTaskException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
                
        System.out.println("\nAstronaut " + astronaut.getName() + " Results:");
        System.out.println(astronaut.getResults());

        scanner.close();
    }
}