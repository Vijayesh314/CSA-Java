public class Allowance
{
	public static void main(String[] args)
	{
		final float ALLOWANCE = 8.75;
  		int age = 16;
		boolean isOldEnough = true;
  		System.out.print("Gina’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Gina’s weekly allowance is ");
		System.out.println(ALLOWANCE);

		// Carl's information
		int age = 16 - 3;
		if (age >= 8) {
         isOldEnough = true;
      	} else {
         isOldEnough = false;
      	}
		System.out.print("Carl’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Carl’s weekly allowance is ");
		if (isOldEnough) {
     	System.out.println(ALLOWANCE);
  		} else {
     	System.out.println(0);
  		}

		// Jennifer's information
		int age = (16 - 3) - 10;
  		if (age >= 8) {
         isOldEnough = true;
      	} else {
         isOldEnough = false;
      	}
		System.out.print("Jennifer’s age is ");
		System.out.println(age);
		System.out.print("Eligible for allowance? ");
		System.out.println(isOldEnough);
		System.out.print("Jennifer’s weekly allowance is ");
		if (isOldEnough) {
         System.out.println(ALLOWANCE);
      	} else {
         System.out.println(0);
      }
	}
}
