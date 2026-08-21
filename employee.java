

class employee{
    private String empName;
    private int empId;
    private long salary;


    public employee(String empName,int empId,long salary){
        this.empName=empName;
        this.empId=empId;
        this.salary=salary;

    }
    

    public String getEmpName() {
        return empName;
    }


    public void display_data(){
        System.out.println("EMPNAME: "+empName+"ID: "+empId+"Emp salary: "+salary);

    }
}