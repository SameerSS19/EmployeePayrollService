package com.employeepayroll;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    public enum IOService{CONSOLE_IO,FILE_IO,DB_IO,REST_IO}

    private static List<EmployeePayrollData> employeePayrollList;

    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList){
        this.employeePayrollList = employeePayrollList;
    }

    public EmployeePayrollService(){

    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Employee PayRoll Service Program");
        ArrayList<EmployeePayrollData> employeePayrollist = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollist);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData(IOService.CONSOLE_IO);

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

    /* Write Employee Payroll data to console */
    public void writeEmployeePayrollData(IOService ioService) {
        if(ioService.equals(IOService.CONSOLE_IO))
            System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
        else if(ioService.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().writeData(employeePayrollList);
        }
    }
    /* Print Employee Payroll */
    public void printData(IOService fileIo) {
        if(fileIo.equals(IOService.FILE_IO)) {
            new EmployeePayrollFileIOService().printData();
        }

    }

}
