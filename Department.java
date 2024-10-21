/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.ArrayList;

public class Department {

    int dno ;
    String dname;
    ArrayList <Employee> emplist ; /*   emplist اللي هوا refernce عشان تخزن من جميع الموظفين لأن الموظفين بيورثو منه وعرفت الEmployee من نوع  ArrayList عملت ال */
                                    //هنا على مستوى الكلاس عشان يكون متاح لجميع الميثزودز ودا هيسمح اننا نستخدمه في أي مكان في الكلاس 

    public Department() {
    }

    public Department(int dno, String dname) {
        this.dno = dno;
        this.dname = dname;
        emplist = new ArrayList <Employee>(); // الخاصه بيه emplist يتم انشاؤوه يكون ليه ال Department هنا عشان كل اوبجكت من كلاس ال ArrayList عملت الاوبجكت بتاع ال
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getDno() {
        return dno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }


    public void add_employee(Employee e)
    {
        emplist.add(e);
    }
    
    public void remove_employee(int idx)
    {
        emplist.remove(idx);
    }
    
    public int getemployeecount()
    {
        System.out.print("the number of employees is ");
        return emplist.size();
    }
    
    public void print_basic_data()
    {
        for (int i=0 ; i<emplist.size();i++)
        {
            System.out.println( emplist.get(i).getSsn() + " " + emplist.get(i).getName() + " " + emplist.get(i).getGender());
        }
    }
    
    public void print_All_details() {
        for (int i = 0; i < emplist.size(); i++) {
            Employee emp = emplist.get(i);
            if (emp instanceof BasePlusCommissionEmployee) 
            {
                ((BasePlusCommissionEmployee) emp).DisplayAllDetails();
            }

            else if (emp instanceof CommissionEmployee) 
            {
                ((CommissionEmployee) emp).DisplayAllDetails();
            }

            else if (emp instanceof HourlyEmployee) 
            {
                ((HourlyEmployee) emp).DisplayAllDetails();
            }

            else if (emp instanceof SalariedEmployee) // SalariedEmployee لو طلع Employee <--اللي من نوع ArrayList هل الموظف اللي متخزن في ال
            {
                ((SalariedEmployee) emp).DisplayAllDetails();//واعرضلي الميثود دي SalariedEmployee وخزنهولي في Employee من النوع الأصلي اللي هوا casting اعملي
            }
        }
    }
    

}
