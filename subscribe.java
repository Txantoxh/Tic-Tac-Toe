import java.util.Scanner;

class inputprogram {
    public static void main(String[]args)
    {
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter your name:");
    String firstname = scan.nextLine();
    
    System.out.print("Enter your last name: ");
    String Lastname = scan.nextLine();
    
    System.out.println("Your full name is:" + firstname + " " + Lastname);
    
   
    
  }
}
