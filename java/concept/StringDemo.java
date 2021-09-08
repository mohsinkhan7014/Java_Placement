package com.mohsin.java.concept;

public class StringDemo {
    public static void main(String[] args) {
        //initialization of String
        String name ="Mohsin";//creating a object of String class with the help of name reference variable which is pointing towards the "Mohsin" in Heap Memory
        String name1="Mohsin";//creating a object of String class with the help of name1 reference variable which is pointing towards the "Mohsin" in Heap Memory
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());//....//means hashcode same pointing towards the same pool of String Mohsin
        //it is kind of pool where Mohsin object is stored name and name1 are pointing the same object(single).
        //if i chnage/update name1 to "Khan" Then it will not reflect for name because of String class feature immutability (Security Purpuse
        //immutability is used for security purpose .lets take an example

        System.out.println("Immutablitity"+name==name1);
        if(name==name1)
        {
            System.out.println("name and name1 are pointing to the same object ");
            System.out.println(name);
            System.out.println(name1);
        }

        name1="Khan"   ;//according the java architechure if two refernce veriable are pointing to same object if one is updated then it will updated for 2nd refernce veriable as well this is called Mutable. But String supports Immutablity

        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());//see the output now for name 1 reference is changed

        if(name!=name1)
        {
            System.out.println("Now Name and Name1 are pointing to the different objects this is called immutability because name1 is update but name is still pointing to the same value ");
            System.out.println(name);
            System.out.println(name1);


        }


        //if we want every refernce varible point the seperate object(but value is same) for this concept we have to
        //use create seperete object by NEW Keyword ..belooww


        String obj1=new String("Golu");//seperate obect will be created by obj1 one
        String obj2=new String("Golu");//seperate obect will be created by obj2 one
        //now in heap memory every object created seperated but value of object is same
        System.out.println("Obj1 hashcode"+obj1.hashCode());
        System.out.println("obj2 hascode"+obj2.hashCode());
        System.out.println("it is checking by refernce "+obj1==obj2);
        System.out.println("it is checking by value  :     "+obj1.equals(obj2));

        //if you need somehting need to check value then equals method is good
        if(obj1==obj2)
        {
            System.out.println("obj1 and obj2 are same ");
        }else
        {
            System.out.println("This is Cheked by refernce so it is not equal by refermce ");
        }


        if(obj1.equals(obj2))
        {
            System.out.println("Now it is checked by value which is true for same value");
        }




    }
}
