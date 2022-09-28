public class Employee {

    private int salary;
     
    // Static: We dont need any object to call methods or variables

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void increment(){
        this.salary+=1000;
    }

    public static int calculateSalary(int salary){
        return salary + 10;
    }
    public static void main(String[] args) {
        
        Employee vishal = new Employee();
        vishal.setSalary(100);

        int vishalSal = calculateSalary(vishal.getSalary());

        System.out.println("Vishals Salary:"+vishalSal);
        vishal.increment();
        System.out.println("Vishals Salary after increment:"+vishal.getSalary());
    }
    
}
