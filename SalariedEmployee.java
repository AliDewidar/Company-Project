package revision;

public class SalariedEmployee extends Employee implements Displayable {

   private double salary;
   private double bonus;
   private double deduction;

    public SalariedEmployee(){
        
    }
    public SalariedEmployee(String name,int age,int ssn,String address,Gender gender,double salary,double bonus,double deduction){
        super(name,age,ssn,address,gender);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }


    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    public void setDeduction(double deduction){
        this.deduction = deduction;
    }

    public double getSalary(){
        return salary;
    }
    public double getBonus(){
        return bonus;
    }
    public double getDeduction(){
        return deduction;
    }

    @Override
    public String toString(){
        return "Salary: " + salary + "\nBonus: " + bonus + "\nDeduction: " + deduction+"\n";
    }

    @Override
    public double Earning(){
        return (salary+bonus)-deduction;
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println("Salaried Employee Details:");
        System.out.println(super.toString());
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Earning: " + Earning());
        System.out.println("\n");
    }
    @Override
    public void DisplayEarning(){
        System.out.println("Earning: " + Earning());
    }
    

}
