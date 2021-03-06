package Com.Massvaccination;

public class Main {
    public static void main(String[] args){
        Database.clearDatabase();                 // Calling Database to clear file ( Also since in the same package no need to import )
        Controller controller = new Controller(); // To import class Controller
        String input;                             // Declare empty string

        boolean run = true;                       // Declare boolean run to = true
        while(run) {                              // While-loop to run, as long as run = true
            input = controller.start();           // Set input to call on class/method, which then calls on scanner


            // Step 1.
            // Switch-method to listen to input
            // if other than 1 || 2, set run == false breaking the method.
            switch (input) {
                case "1":
                    controller.country();         // Call on method country in class controller (Small letter in class since we imported)
                    break;
                case "2":
                    controller.calculated();          // Call on method booker in class controller  (Small letter in class since we imported)
                    break;
                default:
                    run = false;                  // run = false to end while loop
                    Display.exit();               // Call on method exit in class Display
                    break;
            }
        }
    }
}
