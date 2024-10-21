package revision;

public class HourlyEmployee extends Employee implements Displayable {
    private double Hour_rate;
    private double no_hours_worked; //number of hours worked

    public HourlyEmployee(){

    }

    public HourlyEmployee(String name,int age,int ssn,String address,Gender gender,double Hour_rate, double no_hours_worked){
        super(name,age,ssn,address,gender);
        this.Hour_rate = Hour_rate;
        this.no_hours_worked = no_hours_worked;
    }

    public void setHourRate(double Hour_rate) {
        this.Hour_rate = Hour_rate;
    }

    public double GetHourRate(){
        return Hour_rate;
    }

    public void setHoursWorked(double no_hours_worked){
        this.no_hours_worked = no_hours_worked;
    }

    public double GetHoursWorked(){
        return no_hours_worked;
    }

    @Override
    public double Earning(){
        return Hour_rate * no_hours_worked;
    }

    @Override
    public String toString(){
        return "Hour rate " + Hour_rate + " no_hours_worked " + no_hours_worked+"\n";
    }

    @Override
    public void DisplayAllDetails() {
        System.out.println("Hourly Employee Details:");
        System.out.println(super.toString());
        System.out.println("Hour rate: " + Hour_rate);
        System.out.println("Hours worked: " + no_hours_worked);
        System.out.println("Earning: " + Earning());
        System.out.println("\n");
    }


    @Override
    public void DisplayEarning(){
        System.out.println("Earning: " + Earning());
    }
    
    
}
