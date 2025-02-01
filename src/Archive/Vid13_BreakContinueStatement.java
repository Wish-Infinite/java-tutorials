package Archive;

public class Vid13_BreakContinueStatement {
    public static void main(String[] args) {
//        for(int i=1; i<=10; i++){
//            if(i == 5){
//                break;
//            }
//            System.out.println(i);
//        }

//        int j = 1;
//        while (j<=10){
//            if(j==5){
//                break;
//            }
//            System.out.println(j);
//            j++;
//        }

//        for(int k=1 ; k<=10; k++){
//            if(k==5){
//                continue;
//            }
//            System.out.println(k);
//        }

        int x =1;
        while(x<=10){
            if(x==5){
                x++;
                continue;
            }
            System.out.println(x);
            x++;
        }
    }
}

