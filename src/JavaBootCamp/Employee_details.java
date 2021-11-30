/*      EmpId			EmpName			Salary
        ======================================
        1001			Raman 			10000
        1002			Rohit			20000
        1003			Manoj			12000
        1004			Amit 			12000
        1005			Kabir			11500
        1006			Laxman			11500
        1007			Dipesh			10000
        1008			Amit 			10000
        1009			Manoj			17500
        1010			Rohit			21000
        1003			Manoj			15000
        1002			Rohit			20000

1. Store All the above Employee using Suitable Collections.

2. Print Employee List in sorting order of empId (using comparator/comparable)

3. (a) Print all the unique Employee (use equals and hashcode and store in set)

   (b) Sort the above unique Employee according to name

4. (a) Store All the Employee List using EmpId as a key in Map and value should be EmployeeDetails
        Example
        map.put("1001", new Employee(1001,"Dummy",8000));
        (b) Fetch Employee Details By empId

 5. Print all the Employee Details Salary wise in json format
        (a) Sort Employee List by name
        (b) Salary should be in ASC order
        Example :
        [
        {
        "salary":10000
        "empList":[
        {
        "empId":"1001",
        "empName":"Raman"
        },
        {
        "empId":"1002",
        "empName":"Dipesh"
        }
        ]

        },
        {
        "salary":12000
        "empList":[
        {
        "empId":"1003",
        "empName":"Manoj"
        },
        {
        "empId":"1004",
        "empName":"Amit"
        }
        ]

        }
        ]
*/

package JavaBootCamp;

import java.util.*;

class Employee {
    int EmpId;
    String EmpName;
    int salary;

    public Employee(int EmpId, String EmpName, int salary) {
        super();
        this.EmpId = EmpId;
        this.EmpName = EmpName;
        this.salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }
    public void setEmpId(int empId) {
        this.EmpId = empId;
    }
    public String getEmpName() {
        return EmpName;
    }
    public void setEmpName(String empName) {
        this.EmpName = empName;
    }
    public int getEmpSalary() {
        return salary;
    }
    public void setEmpSalary(int Salary) {
        this.salary = Salary;
    }

    @Override
    public String toString(){
        return "Employee ["
                + "EmpId=" + EmpId
                + "EmpName=" + EmpName
                + "salary=" + salary
                + "]";
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(this == obj) {
//            return true;
//        }
//        if(obj == null || this.getClass() != obj.getClass()){
//            return false;
//        }
//        Employee emp = (Employee)obj;
//        return this.EmpName.equals(emp.EmpName);
//    }
}

class EmployeeComparator implements Comparator<Employee>
{
    public int compare(Employee emp1, Employee emp2)
    {
        if (emp1.EmpId == emp2.EmpId)
            return 0;
         else if (emp1.EmpId > emp2.EmpId)
            return 1;
        else
            return -1;
    }
}

public class Employee_details {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        Employee e1 = new Employee(1001, "Raman", 10000);
        Employee e2 = new Employee(1002, "Rohit", 20000);
        Employee e3 = new Employee(1003, "Manoj", 12000);
        Employee e4 = new Employee(1004, "Amit", 12000);
        Employee e5 = new Employee(1005, "Kabir", 11500);
        Employee e6 = new Employee(1006, "Laxman", 11500);
        Employee e7 = new Employee(1007, "Dipesh", 10000);
        Employee e8 = new Employee(1008, "Amit", 10000);
        Employee e9 = new Employee(1009, "Manoj", 17500);
        Employee e10 = new Employee(1010, "Rohit", 21000);
        Employee e11 = new Employee(1003, "Manoj", 15000);
        Employee e12 = new Employee(1002, "Rohit", 20000);


        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        list.add(e8);
        list.add(e9);
        list.add(e10);
        list.add(e11);
        list.add(e12);

        System.out.println("Before sorting");
        for (Employee e : list) {
            System.out.println(e.EmpId + " " + e.EmpName + " " + e.salary);
        }

        System.out.println("\nAfter Sorting(Sorted by Employee ID using Comparator)");

        Collections.sort(list, new EmployeeComparator());
        for (Employee e : list) {
            System.out.println(e.EmpId + " " + e.EmpName + " " + e.salary);
        }

        Map<Integer, Employee> mapOfEmployees = new HashMap<Integer, Employee>();

        for (Employee employee : list) {
            mapOfEmployees.put(employee.getEmpId(), employee);
        }

        System.out.println("\n\n Map of Employee : \n" + mapOfEmployees);


        for (Map.Entry<Integer, Employee> pair : mapOfEmployees.entrySet()) {
            System.out.println(String.format("EmpId is: %s, Employee Details are : %s", pair.getKey(), pair.getValue()));
        }
    }
}
