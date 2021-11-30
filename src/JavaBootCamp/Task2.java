package JavaBootCamp;

import java.security.spec.ECParameterSpec;
import java.util.*;

public class Task2  {
    public static void main(String[] args) {
        //1st
        List<Employee> arr;
        arr = new ArrayList<>();



        arr.add(new Employee(1001, "Raman",10000));

        arr.add(new Employee(1002, "Rohit",20000));
        arr.add(new Employee(1003, "Manoj",12000));
        arr.add(new Employee(1004, "Amit",12000));
        arr.add(new Employee(1005, "Kabit",11500));
        arr.add(new Employee(1006, "Lakshman",11500));
        arr.add(new Employee(1007, "Dipesh",10000));
        arr.add(new Employee(1008, "Amit",10000));
        arr.add(new Employee(1009, "Manoj",17500));
        arr.add(new Employee(1010, "Rohit",21000));
        arr.add(new Employee(1003, "Manoj",15000));
        arr.add(new Employee(1002, "Rohit",20000));


        for (int i=0;i< arr.size();i++){
            arr.get(i).display();
        }
        //2nd
        Collections.sort(arr, new Comparator<EmployeeClass>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.empid-o2.empid;
            }
        });
        System.out.println("sorted"+arr.toString());

        EmployeeClass x = new EmployeeClass();
        x.store(arr);

        x.sort_();
        //4th

        Map<Integer,Employee> employee=new HashMap<>();
        for (Employee e:
                arr) {

            employee.put(e.empid,e);
        }
        System.out.println(employee.toString());
        Collections.sort(arr, new Comparator<EmployeeClass>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.salary-o2.salary;
            }
        });
        //5th

        System.out.println("[");
        System.out.print(" ");
        System.out.print(" ");
        System.out.println(" ");
        List<Employee> temp_ = new LinkedList<>();
        int sal = arr.get(0).salary;
        temp_.add(arr.get(0));
        for(int i = 1; i < arr.size(); i++) {

            if(arr.get(i).salary == sal) {
                temp_.add(arr.get(i));
            }
            else{
                System.out.println("{");
                System.out.println("salary :" + sal);
                System.out.println("emplist : [");

                int j = 0;
                while(j < temp_.size()) {
                    System.out.println("{");
                    System.out.println("empId" + temp_.get(j).empid);
                    System.out.println("empName" + temp_.get(j).empname);
                    System.out.println("}");
                    j++;
                }
                System.out.println("]");
                System.out.println("},");

                temp_ = new LinkedList<>();
                temp_.add(arr.get(i));
                sal = arr.get(i).salary;
            }
        }
        System.out.println("]");
    }
}





