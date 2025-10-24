public class DeMorgansLaw
{
  public static void main(String[] args)
  {
    System.out.println("Validating De Morgan's Second Law: !(a || b) == (!a && !b)\n");

    boolean[] values = {true, false};

    for (boolean a : values) {
      for (boolean b : values) {

        System.out.println("--- Case: a=" + a + ", b=" + b + " ---");

        boolean leftSide = !(a || b);

        boolean rightSide = (!a && !b);

        if (leftSide) {
          System.out.println("  Left Side [!(a || b)]: TRUE");
        } else {
          System.out.println("  Left Side [!(a || b)]: FALSE");
        }

        if (rightSide) {
          System.out.println("  Right Side [(!a && !b)]: TRUE");
        } else {
          System.out.println("  Right Side [(!a && !b)]: FALSE");
        }

        if (leftSide == rightSide) {
          System.out.println("Law holds: Both sides are the same.");
        } else {
          System.out.println("Error: Sides do not match!");
        }
      }
    }
  }
}
