package Archive;

public class Vid8_IfElseConditionalStatement {
    public static void main(String[] args) {
//        int age = 14;
//        if(age>=18){
//            System.out.println("You are eligible to Vote");
//        }

//        if(age>=18){
//            System.out.println("You are eligible to Vote");
//        }else{
//            System.out.println("You are not eligible to Vote");
//        }

        int marks = 30;
        boolean extraCurricular = true;
        if(marks>=90 && extraCurricular){
            System.out.println("Grade A");
        }else if(marks>=75 && extraCurricular){
            System.out.println("Grade B");
        }else if(marks>=50){
            System.out.println("Grade C");
        }else{
            System.out.println("Fail");
        }
    }
}
