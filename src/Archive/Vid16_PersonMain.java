package Archive;

public class Vid16_PersonMain {
    public static void main(String[] args) {
        Vid16_Person person1 = new Vid16_Person();
        Vid16_Person person2 = new Vid16_Person("Tom");
        Vid16_Person person3 = new Vid16_Person(25);
        Vid16_Person person4  = new Vid16_Person("Rose", 23);
        System.out.println(person2.name);
        System.out.println(person2.age);
        person2.walk();
    }
}
