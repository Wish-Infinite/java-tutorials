package package2;
import package1.A;

public class C {
    public static void main(String[] args) {
        A aObj =new A();
        System.out.println(aObj.varPublic);
        aObj.sayPublic();

//        aObj.varProtected;
//        aObj.sayProtected();

//        aObj.varDefault;
//        aObj.sayDefault();

//        aObj.varPrivate;
//        aObj.sayPrivate();
    }

}
