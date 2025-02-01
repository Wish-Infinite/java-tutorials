package package1;

public class A {

    public String varPublic = "WishInfinite";

    public void sayPublic(){
        System.out.println("Hello Public");
    }

    /// ///////////////////////
    protected String varProtected = "WishInfinite Protected";

    protected void sayProtected(){
        System.out.println("Hello Protected");
    }

    /// /////////////////////////

    String varDefault = "WishInfinite Default";

    void sayDefault(){
        System.out.println("Hello Default");
    }

    /// ///////////////////
    private String varPrivate = "WishInfinite Private";

    private void sayPrivate(){
        System.out.println("Hello Private");
    }

    public static void main(String[] args) {
        A aObj = new A();

//        System.out.println(aObj.varPublic);
//        aObj.sayPublic();
//
//        System.out.println(aObj.varProtected);
//        aObj.sayProtected();

//        System.out.println(aObj.varDefault);
//        aObj.sayDefault();

        System.out.println(aObj.varPrivate);
        aObj.sayPrivate();


    }

}
