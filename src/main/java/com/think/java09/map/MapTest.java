package com.think.java09.map;



import java.util.HashMap;

/**
 * @Classname MapTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/7 14:40
 * @Created by deer-li
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String, Employee> staff = new HashMap<>();
        staff.put("144-25-5464",new Employee("Amy Lee"));
        staff.put("567-24-2546",new Employee("Harry Hacker"));
        staff.put("157-62-7935",new Employee("Gary Cooper"));
        staff.put("456-62-5527",new Employee("Francesca Cruz"));
        System.out.println(staff);
        staff.remove(staff);
        staff.put("456-62-5527",new Employee("Francesca Miller"));
        System.out.println(staff.get("157-62-7935"));
        staff.forEach((k,v)-> System.out.println(" key= "+k+" ,value= "+v));
    }
}
class Employee{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
