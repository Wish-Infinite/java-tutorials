package package2;

import package1.A;

public class AChild extends A {
    public static void main(String[] args) {
        A aObj = new A();
        System.out.println(aObj.varPublic);
        aObj.sayPublic();

        AChild oChildObj = new AChild();
        System.out.println(oChildObj.varPublic);
        oChildObj.sayPublic();

//        aObj.varProtected;
//        aObj.sayProtected();

        System.out.println(oChildObj.varProtected);
        oChildObj.sayProtected();

//        aObj.varDefault;
//        aObj.sayDefault();

//        oChildObj.varDefault;
//        oChildObj.sayDefault()

//        aObj.varPrivate;
//        aObj.sayPrivate();
//
//        oChildObj.varPrivate;
//        oChildObj.sayPrivate();
    }
}
