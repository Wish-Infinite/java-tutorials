package Archive;

public class Vid9_SwitchConditionalStatement {
    public static void main(String[] args) {
//       switch (exp){
//           case value1 :
//               //Code
//              break;
//           case value2 :
//               //code
//              break;
//           case value3 :
//               //code
//              break;
//           default:
//               //code
//       }

        String day = "two";
        switch (day){
            case "one":
                System.out.println("Monday");
                break;
            case "two":
                System.out.println("Tuesday");
                break;
            case "three":
                System.out.println("Wednesday");
                break;
            case "four":
                System.out.println("Thursday");
                break;
            case "five":
                System.out.println("Fri");
                break;
            case "six":
                System.out.println("Sat");
                break;
            case "seven":
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}
