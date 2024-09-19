public class Person {

    private String name;
    private int age;

    private String gpa;
    private double score;
    private int year;

    public Person(String name, int age, String gpa, double score, int year){

        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.score = score;
        this.year = year;
    }

    public void displayDetails(){

        int maxInt = Integer.MAX_VALUE;
        long maxPlusOne =20000000000000000L;
        System.out.println(maxInt);
        System.out.println(maxPlusOne);
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
        System.out.println(gpa + score + " in " + year +" years of study");


    }

    public static void main(String [] args){

        Person person = new Person("Anas",24,"My GPA is ", 3.5, 2);
        person.displayDetails();
    }

}
