//class called “Person” with properties
public class Person {

     private String name ;
     private int age ;
     private double salary ;

    //Creating a no-arg constructor for the Person
    public Person() {
    }

//Creating of a second constructor with three arguments
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
//Create a third constructor that takes in two arguments
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        salary = -1;
    }

    public  void displayInfo(){

        System.out.println("Ce dévelopeur s'appelle"+ name + " il a "+ age + "ans "+ "et son salaire est de" + salary + "Francs CFA" );

    }

        public static void main(String[] args) {
            Person person = new Person();
            Person person2 = new Person("sango",28, 645000);
            Person person3 = new Person("dez", 28,  -1);

            person.displayInfo();
            person2.displayInfo();
            person3.displayInfo(){
                if (salary = -1){
                    System.out.println("Salary not provided");

                }
            }




        }



}
