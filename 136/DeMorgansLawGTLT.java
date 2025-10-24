import java.util.Scanner; 

public class DeMorgansLawGTLT
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in); 
    
    System.out.println("Enter an integer for X:");
    int x = sc.nextInt();

    System.out.println("Enter an integer for Y:");
    int y = sc.nextInt(); 
    
    System.out.println("Checking that both x and y are not negative (Original &&): ");
    if (!(x < 0) && !(y < 0)) {
      System.out.println("Result: Both x and y are not negative.");
    } else {
      System.out.println("Result: At least one of the numbers is negative.");
    }

    System.out.println("\nChecking that x < 0 AND y < 0 is FALSE (New OR): ");
    if (!(x < 0 || y < 0)) {
      System.out.println("Result: The condition (x < 0 OR y < 0) is FALSE.");
      System.out.println("This confirms that both x and y are not negative.");
    } else {
      System.out.println("Result: The condition (x < 0 OR y < 0) is TRUE.");
      System.out.println("This confirms that at least one of the numbers is negative.");
    }

    /// Short-circuit evaluation could occur at the || operator in: !(x < 0 || y < 0)
    /// If the first condition, (x < 0), evaluates to TRUE (i.e., x is negative), the entire OR expression (x < 0 || y < 0) is instantly TRUE. 
    /// The second condition, (y < 0), will then not be evaluated (it is short-circuited).
    

    sc.close();
  }
}
