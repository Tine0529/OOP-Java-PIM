class Employee {

    //การเข้าถึง
    public int id;
    public String name;
    private double salary;
    
    // instance method
    public void setSalary (double salary) {
        
        //เงื่อนไข
        if (salary >= 15_000 && salary <= 100_000)
            this.salary = salary;
    }
    
    public double gerSalary () {
    
        
        return salary;
    }
    
}

public class EmployeeTestDrive {
    
    public static void main (String [] args) {
        
    Employee tine = new Employee ();
    tine.id = 411;
    tine.name = "Jirapong Rakwong";
    //tine.salary = 10_000;
    tine.setSalary(17_000);
    System.out.println(tine.gerSalary());
        
        
    }
}