import java.util.Scanner;

class inputprogram {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your name:");
    String firstname = input.next();
    

    System.out.print("Enter your last name: ");
    String Lastname = input.next();
   
    System.out.println("Your full name is " + firstname + " " + Lastname );
  }
}
