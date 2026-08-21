public class Manager extends employee {
    private long bonus;

    public Manager( String empName,int empId,long salary,long bonus){

        super(empName, empId, salary);
        this.bonus=bonus;
        
    }

    @Override
    public void display_data(){
        super.display_data();
        System.out.println("Bonus: "+bonus);
    }
}
