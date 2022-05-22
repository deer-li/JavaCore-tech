package com.think2.java02.textFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @Classname TextFileTest
 * @Description TODO
 * @Version 1.0.0
 * @Date 2022/5/22 10:48
 * @Created by deer-li
 */

public class TextFileTest {
    public static void main(String[] args) throws IOException {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("CC",75000,1987,12,15);
        staff[1]=new Employee("HH",50000,1989,10,15);
        staff[2]=new Employee("TT",40000,1990,3,15);
        try (PrintWriter out = new PrintWriter("employee.dat", StandardCharsets.UTF_8);
        ){
            writeData(staff,out);
        }

        try(Scanner in = new Scanner(new FileInputStream("employee.dat"), "UTF-8")) {
            Employee[] newStaff=readData(in);
            for (Employee e:newStaff){
                System.out.println(e);
            }
        }

    }

    private static Employee[] readData(Scanner in) {
        int n = in.nextInt();
        in.nextLine();
        Employee[] employees = new Employee[n];
        for (int i=0;i<n;i++){
            employees[i]=readEmployee(in);
        }
        return employees;
    }

    private static Employee readEmployee(Scanner in) {
        String line = in.nextLine();
        String[] token = line.split("\\|");
        String name = token[0];
        double salary = Double.parseDouble(token[1]);
        LocalDate hireDate = LocalDate.parse(token[2]);
        int year=hireDate.getYear();
        int month=hireDate.getMonthValue();
        int day=hireDate.getDayOfMonth();
        return new Employee(name,salary,year,month,day);
    }

    private static void writeData(Employee[] staff, PrintWriter out) throws IOException{
        out.println(staff.length);
        for (Employee e:staff){
            writeEmplyee(out,e);
        }
    }

    private static void writeEmplyee(PrintWriter out, Employee e) {
        out.println(e.getName()+"|"+e.getSalary()+"|"+e.getHireDay());
    }
}

