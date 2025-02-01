package Archive;

public class Vid4_JavaProgram2 {
    public static void main(String[] args){
        String name = "WishInfinite";
        String message = "Welcome to My Channel ";
        String name2 = new String("WishInfinite");

        System.out.println(name);
        System.out.println(message);

        int len = name.length();
        System.out.println(len);

        String fullMessage  = message.concat(name);
        System.out.println(fullMessage);

        String fullName2 = message + name;
        System.out.println(fullName2);

        char val = message.charAt(3);
        System.out.println(val);

        String newMessage = message.replace('l','d');
        System.out.println(newMessage);

        String subMessage =  message.substring(1,10);
        System.out.println(subMessage);


    }
}
