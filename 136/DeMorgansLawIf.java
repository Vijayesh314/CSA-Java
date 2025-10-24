public class DeMorgansLawIf
{
  public static void main(String[] args)
  {
    boolean[] values = {true, false};

    for (boolean a : values) {
      for (boolean b : values) {

        System.out.println("Case: a=" + a + ", b=" + b);
        boolean resultNotAnd = false;

        if (a) {
          if (b) {
            resultNotAnd = false;
          } else {
            resultNotAnd = true;
          }
        } else {
          resultNotAnd = true;
        }

        System.out.println("  Result for !(a && b): " + resultNotAnd);
        boolean resultNotOr = false;

        if (a) {
          resultNotOr = false;
        } else {
          if (b) {
            resultNotOr = false;
          } else {
            resultNotOr = true;
          }
        }

        System.out.println("  Result for !(a || b): " + resultNotOr);
      }
    }
  }
}
