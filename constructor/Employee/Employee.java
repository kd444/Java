public class Employee {

    private String empName;
    private String companyName;

    // Constructor for initialization gets called everytime
    public Employee() {
        this.companyName = "TCS";
    }

    // Parameterized Constructor
    public Employee(String name) {
        this.companyName = "TCS";
        this.empName = name;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public static void main(String[] args) {

        Employee vishal = new Employee("Vishal");
        Employee darshan = new Employee("Darshan");

        System.out.println(vishal.getCompanyName());
        System.out.println(darshan.getCompanyName());

        System.out.println(vishal.getEmpName());
        System.out.println(darshan.getEmpName());

    }
}