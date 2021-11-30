////     4. (a) Store All the Employee List using EmpId as a key in Map and value should be EmployeeDetails
////        Example
////        map.put("1001", new Employee(1001,"Dummy",8000));
////        (b) Fetch Employee Details By empId
//
//
//        package JavaBootCamp;
//import java.util.*;
//
//public class HashMAP_Assignment
//{
//    public static void main(String arg[])
//    {
//        HashMap<Integer, String> hm=new HashMap<Integer, String>();
//
//        hm.put("1001", "Raman", 10000);
//
//        hm.put(57,”anusha”);
//
//        hm.put(50,”ajith”);
//
//        hm.put(33,”aparna”);
//
//        hm.put(71,”alekhya”);
//
//        hm.put(99,”babitha”);
//
//        hm.put(11,”amani”);
//
//        Iterator trav=hm.entrySet().iterator();
//        while(trav.hasNext())
//        {
//            Map.Entry record=(Map.Entry)trav.next();  //will give next (Key, Value) pair
//
//            System.out.println(record.getKey()+”–>”+record.getValue());
//        }
//    }
//}