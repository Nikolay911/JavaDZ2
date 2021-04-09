package com.alterr;

public class Employee implements Measurable {

    private String name;
    private double sallary;

    public Employee(){

    }

    public Employee(String name, double sallary){
        this.name = name;
        this.sallary = sallary;
    }


    public void setSallary(double sallary) {
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return sallary;
    }

    public static double average(Measurable[] objects){
        int a = objects.length;
        double c = 0;
        for(int i = 0; i < a; i++){
            c += objects[i].getMeasure();
        }
        System.out.println("Средняя зарплата: ");
        return  c/a;
    }

    public static String largest(Measurable[] objects){
        int a = objects.length;
        Employee employee = (Employee)objects[0];
        for(int i = 0; i < a-1; i++){
            if(objects[i+1].getMeasure()>objects[i].getMeasure()){
                employee = (Employee)objects[i+1];
            }
        }
        return employee.name + " have a largest sallary.";
    }
}
