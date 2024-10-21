package revision;


public class Revision {

    public static void main(String[] args) {


        Department d1 = new Department(1, "Information Systems");
        

        SalariedEmployee se = new SalariedEmployee("Ahmed",25,51548,"Riyadh",Gender.male,3700,500,0);       
        d1.add_employee(se);
        

        HourlyEmployee he = new HourlyEmployee("Ibrahim",30,5048,"khobar",Gender.male,40,6);
        d1.add_employee(he);
        
        CommissionEmployee ce = new CommissionEmployee("Fatma",27,50876,"Riyadh",Gender.female,15000,0.25);
        d1.add_employee(ce);

        BasePlusCommissionEmployee bpce = new BasePlusCommissionEmployee("Ali",23,54872,"Macca",Gender.male,25000,0.3,8000);
        d1.add_employee(bpce);
        

        // System.out.println(d1.getemployeecount()+"\n");
       

        // d1.print_basic_data();  
       

        d1.print_All_details();
        

    }    
}
