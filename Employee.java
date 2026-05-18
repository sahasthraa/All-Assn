 public class Employee {
    String EmployeeName;
    int EmployeeSalary;
        



    public void displayDetails(Employee obj){
        System.out.println(obj.EmployeeName);
        System.out.println(obj.EmployeeSalary);
    }
    public static void main(String args[]){
        Employee obj=new Employee();
        obj.EmployeeName="akshay";
        obj.EmployeeSalary=20000;
        obj.displayDetails(obj);
        
    
    }
    public String getName() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getName'");
    }
}



    

