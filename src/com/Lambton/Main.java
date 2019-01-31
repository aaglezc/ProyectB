package com.Lambton;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("--Project B");
        Employee e = new Employee(1,"Arthur G.",47);

        System.out.println(e.calcEarning());
        System.out.println(e.getId()+" --"+e.getName()+" --"+e.getAge());


    }
}
