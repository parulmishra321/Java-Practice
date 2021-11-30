package JavaBootCamp;

class sub{
    public void myMethod()
    {
        System.out.println("Overridden method");
    }
}

public class Super  extends sub{
    public void myMethod(){
        super.myMethod();
        System.out.println("Overriding method");
    }
    public static void main( String args[]) {
        Super obj = new Super();
        obj.myMethod();
    }
}