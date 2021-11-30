package JavaBootCamp;

import java.util.*;

public class EmployeeClass {
    public int empid;
    public String empname;
    public int salary;

    public Set<Employee> unique_emp=new HashSet<>();

    public EmployeeClass(int empid, String empname,int salary)
    {
        this.empid = empid;
        this.empname = empname;
        this.salary=salary;
    }
    public EmployeeClass() {

    }
    public void display()
    {
        System.out.println(  empid  +" " + " " +  empname  + " " + salary);

        System.out.println();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                '}';
    }
    //3rd

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeClass employee = (EmployeeClass) o;
        return empid == employee.empid &&
                salary == employee.salary &&
                empname.equals(employee.empname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empid, empname, salary);
    }

    public void store(List<EmployeeClass> arr){

        for(int i=0;i<arr.size();i++){
            unique_emp.add(arr.get(i));
        }

        System.out.println(unique_emp.toString());

    }

    public void sort_(){
        List<EmployeeClass> temp = new LinkedList<>();
        for(Employee e : unique_emp) {
            temp.add(e);
        }

        Collections.sort(temp, new Comparator<EmployeeClass>() {
            @Override
            public int compare(EmployeeClass o1, EmployeeClass o2) {
                return o1.empname.compareTo(o2.empname);
            }
        });

        System.out.println(temp.toString());
    }

}

