package Archive;

public class Vid6_Casting {
    public static void main(String[] args) {

        //Implicit Archive.Casting
        int var1  = 132;
        double var2 = var1;
        System.out.println(var2);

        int principalAmount = 2500;
        double interest = 25.34;
        double total = principalAmount + interest;
        System.out.println(total);

        //Explicit casting
        double var3 = 54.6782;
        int var4 = (int) var3;
        System.out.println(var4);

        int principalAmount2 = 2500;
        double interest2 = 25.34;
        //int total2 = principalAmount2 + (int) interest2;
        int total2 = (int)(principalAmount2 + interest2);
        System.out.println(total2);

    }
}
