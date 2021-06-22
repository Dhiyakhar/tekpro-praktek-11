
//Nama : Dhiya Fakhar Nafi
//Kelas : D4 TI-1A
//NIM : 201524002

public class MathUtils {
    // -------------------------------------------------------------
    // Returns the factorial of the argument given
    // -------------------------------------------------------------
    public static int factorial(int n) {
        if (n < 0) {			//Throws the exception
            throw new IllegalArgumentException("n < 0");	//IllegalArgumentException
        }
        else if (n > 16) {
            throw new IllegalArgumentException("n > 16");
        }
        else {
            int fac = 1;
            for (int i = n; i > 0; i--)
                fac *= i;
            return fac;
        }
    }
}