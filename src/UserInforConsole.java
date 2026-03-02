import java.util.Scanner; // we need the scanner to allow input on the terminal

public class UserInforConsole {
    public static void main(String [] args){
        //Declaring scanner
        Scanner scanner = new Scanner(System.in);

        //Declaring variable
        String firstName , lastName;
        int age ;
        double annualSalary , dailySalary ;

        //and asking information

        // User first name
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();
        // User last name
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();
        // User Age
        System.out.print("Enter your age(yrs): ");
        age = scanner.nextInt();
        //user annual salary
        System.out.print("Enter your annual salary: ");
        annualSalary = scanner.nextDouble();





    }
}
