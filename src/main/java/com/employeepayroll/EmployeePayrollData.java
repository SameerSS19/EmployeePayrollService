package com.employeepayroll;

public class EmployeePayrollData {
    /*Instance variable
    *id;
    * name
    * salary
     */
    private int id;
    private String name;
    private double salary;

    /*Constructor for EmployeePayrollData.
    *@param id;
    *@param name;
    * @param salary
     */
    public EmployeePayrollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeePayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}
