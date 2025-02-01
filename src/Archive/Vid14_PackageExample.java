package Archive;

import Archive.Vid14_package_tutorial.Vid14_PackageClass1;
import Archive.Vid14_package_tutorial.Vid14_PackageClass2;

import java.util.Random;

//import package_tutorial.*;

public class Vid14_PackageExample {
    public static void main(String[] args) {
        Vid14_PackageClass1 obj1 = new Vid14_PackageClass1();
        obj1.methodPrint1();

        Vid14_PackageClass2 obj2 = new Vid14_PackageClass2();
        obj2.methodPrint2();

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
    }
}
