package com.employeepayroll;

/*Libraries
     *import ArrayList class
     *Import List class
     *Import the Scanner class
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService {CONSOL_TO, FILE_IO, DB_TO, REST_TO}

    private List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService() {
        employeePayrollList =new ArrayList<>();
    }

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
    }

    /*Main method
    * Print Welcome Message.
    * Creating a Object of EmployeePayrollService.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee PayRoll Service Program");
        ArrayList<EmployeePayrollData> employeePayrollist = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollist);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();
    }
    /* Read Employee Payroll data from console */
    private void readEmployeePayrollData(Scanner consoleInputReader) {
        System.out.println("Enter Employree ID:");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employree Name");
        String name = consoleInputReader.next();
        System.out.println("Enter Employree Salary");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    /*Write Employee Payroll data to console*/
    private void writeEmployeePayrollData() {
        System.out.println("\nWritting Employee Payroll Roaster to Console\n" + employeePayrollList);
    }
}
