package cybertek.tests.o1_intellij_shortcuts;
public class Person {


    public static final String JACK = "Jack";
    String Name;
    String ID;
    int age;
    int SSN;
    String JobTitile;
    double salary;

    public Person(String Name, String ID, int age, int SSN, String JobTitile, double salary ) {
        this.Name = Name;
        this.ID = ID;
        this.age = age;
        this.SSN = SSN;
        this.JobTitile = JobTitile;
        this.salary = salary;
    }


    public void getInfo() {
        System.out.println("Person' name is: "+Name);
        System.out.println("Social Security number is: "+SSN);
        System.out.println("Age is: "+age);
        System.out.println("Job title is: "+JobTitile);
        System.out.println("Person ID is: "+ID);
        System.out.println("Salary is: $"+salary);

        System.out.println("-------------------------------------------");
        String john = "John";

        john = "jane";
        System.out.println(john);
        System.out.println(JACK);
    }




}