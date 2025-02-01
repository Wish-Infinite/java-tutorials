package Archive;

public class Vid10_TernaryOperator {
    public static void main(String[] args) {
        int age = 11;
//        if (age >= 18) {
//            System.out.println("You are eligible to Vote");
//        } else {
//            System.out.println("You are not eligible to Vote");
//        }

        //result = condition ? TurePart : FalsePart;
        String result = (age>=18) ? "You are eligible to Vote" : "You are not eligible to Vote";
        System.out.println(result);
    }
}
