package revision;

/**
 * Employee
 */
enum Gender{male,female} //custome data type 

public abstract class Employee {

   protected String name;
   protected int age;
   protected int ssn;
   protected String address;
   protected Gender gender;

    //empty constructor
    public Employee(){
        
    }
    //constructor
    public Employee(String name,int age,int ssn,String address,Gender gender){
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.gender = gender;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    //getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSsn() {
        return ssn;
    }
    public String getAddress(){
        return address;
    }
    public Gender getGender() {
        return gender;
    }

    //toString Method to show all the details of the employee
    public String toString(){
        return "Name: " + name + "\nAge: " + age + "\nSSN: " + ssn + "\nAddress: " + address + "\nGender: " + gender;
    }
    //abstract method
    public abstract double Earning();
    
}