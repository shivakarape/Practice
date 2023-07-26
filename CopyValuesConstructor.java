/*
    this program is used to copy the values one object into another object using constructor
*/

public class CopyValuesConstructor
{
    int id;
    String name;

    CopyValuesConstructor(int id, String name)
    {
        System.out.println("Constructor called.\n");
        this.id = id;
        this.name = name;
    }
    
    //Copy value of one object into another
    CopyValuesConstructor(CopyValuesConstructor obj)
    {
        this.id = obj.id;
        this.name = obj.name;
    }

    public static void main(String args[])
    {
        //parameterised constructor call
        CopyValuesConstructor obj1 = new CopyValuesConstructor(10, "shiva");
        //print values of object properties.
        System.out.println("obj1 id = " +obj1.id);
        System.out.println("obj1 name = " +obj1.name);
        System.out.println("ref1Name = "+obj1 +"\tHashCode = "+obj1.hashCode());
        //constructor call to copy the value of one object into other
        CopyValuesConstructor obj2 = new CopyValuesConstructor(obj1);
        System.out.println("obj1 id = " +obj2.id);
        System.out.println("obj1 name = " +obj2.name);
        System.out.println("ref2Name = "+obj2 +"\tHashCode = "+obj2.hashCode());
    }
}
