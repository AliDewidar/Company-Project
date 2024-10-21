package revision;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double base;

    public BasePlusCommissionEmployee(){

    }

    public BasePlusCommissionEmployee(String name,int age,int ssn,String address,Gender gender,double GrossSales, double CommissionRate, double base) {
        super(name, age, ssn, address,gender, GrossSales, CommissionRate);
        this.base = base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public double getBase() {
        return base;
    }

    @Override
    public double Earning(){
        return base + super.Earning();
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println("Base Plus Commission Employee Details:");
        super.DisplayAllDetails();
        System.out.println("Base "+ base);
        DisplayEarning();
        System.out.println("\n");
    }

    @Override
    public void DisplayEarning(){
        System.out.println("Earning : " +Earning());
    }
    
}
