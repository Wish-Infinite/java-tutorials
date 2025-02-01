package Archive;

public class Vid16_Person {

    String name;
    int age;

//    public Archive.Person(){
//
//    }

    public Vid16_Person(){
        name = "Wish";
        age = 18;
    }

    public Vid16_Person(String name){
        this.name = name;
    }

    public Vid16_Person(int age){
        this.age = age;
    }

    public Vid16_Person(String personName, int personAge){
        name = personName;
        age = personAge;
    }

    void walk(){
        System.out.println(name + " Archive.Person can walk");
    }
}
