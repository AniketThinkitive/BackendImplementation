class Employee {
  private  int empid ;
    private String empName;

    public void setEmpInfo(int eid,String ename){
    empid=eid;
    empName=ename;
    }

    public void  getEmpInfo(){

        System.out.println("Employee id is : "+empid);
        System.out.println("Employee name is : "+empName);
    }

}
public class Company{
 public static void main(String[] args) {
    Employee e=new Employee();
    e.setEmpInfo(101,"Aniket");
    e.getEmpInfo();
 }

} 