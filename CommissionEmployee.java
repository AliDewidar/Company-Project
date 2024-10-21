package revision;

public class CommissionEmployee extends Employee implements Displayable {
   protected double GrossSales;
   protected double CommissionRate;
   
   public CommissionEmployee(){
    
   }

   public CommissionEmployee(String name,int age,int ssn,String address,Gender gender,double GrossSales, double CommissionRate) {
    super(name, age, ssn, address,gender);
      this.GrossSales = GrossSales;
      this.CommissionRate = CommissionRate;
   }

   public void setGrossSales(double GrossSales) {
      this.GrossSales = GrossSales;
   }
   public void setCommissionRate(double CommissionRate) {
      this.CommissionRate = CommissionRate;
   }
   public double getGrossSales() {
      return GrossSales;
   }
   public double getCommissionRate() {
      return CommissionRate;
   }

   public String toString() {
      return "CommissionEmployee [GrossSales=" + GrossSales +"\n"+ ", CommissionRate=" + CommissionRate + "]";
   }

   @Override
   public double Earning(){
    return GrossSales*CommissionRate;
   }

   @Override
    public void DisplayAllDetails() {
        System.out.println(super.toString());
        System.out.println(toString());
      //   System.out.println("\n");
    }

   @Override
   public void DisplayEarning(){
    System.out.println("Earning: "+Earning());
    }

}
