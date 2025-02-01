package Archive;

public class Vid12_EnhancedForLoop {
    public static void main(String[] args) {
        String[] fruits = {"Mango", "Banana", "Apple", "Guava", "Orange"};
//        System.out.println(fruits[0]);
//
        for(int index=0; index<fruits.length; index++){
            System.out.println(fruits[index]);
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
