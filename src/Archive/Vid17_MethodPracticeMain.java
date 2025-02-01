package Archive;

public class Vid17_MethodPracticeMain {
    public static void main(String[] args) {
        Vid17_MethodPractice obj1 = new Vid17_MethodPractice();
        obj1.printHello();
        obj1.printHello();
        obj1.addNumber(36,45);
        System.out.println(obj1.generateRandomNumber());
        int graterNum = obj1.findGreaterNumber(47,99);
        System.out.println("Grater Number is " + graterNum);


        Vid17_MethodPractice.staticMethodPractice();
    }
}
