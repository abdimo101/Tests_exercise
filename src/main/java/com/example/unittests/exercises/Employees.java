package com.example.unittests.exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Employees {
    private String cpr;
    private String first_name;
    private String last_name;
    private String department;
    private double base_salary;
    private int educational_level;
    private Date date_of_birth;
    private Date date_of_employment;
    private String country;

    public Employees(String cpr, String first_name, String last_name, String department,
                     double base_salary, int educational_level, Date date_of_birth,
                     Date date_of_employment, String country) {
        this.cpr = cpr;
        this.first_name = first_name;
        this.last_name = last_name;
        this.department = department;
        this.base_salary = base_salary;
        this.educational_level = educational_level;
        this.date_of_birth = date_of_birth;
        this.date_of_employment = date_of_employment;
        this.country = country;
    }

    public double getSalary(){
       return this.base_salary + (this.educational_level * 1220);
    }



    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        if (cpr.matches("\\d{10}")){
            this.cpr = cpr;
        }
        else {
            throw new IllegalArgumentException("CPR must have 10 numeric digits");
        }
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        if (first_name.matches("[a-zA-Z\\s-]{1,30}")) {
            this.first_name = first_name;
        } else {
            throw new IllegalArgumentException("First name must be 1-30 characters long and contain alphabetic characters, spaces, or dashes");
        }
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        if (last_name.matches("[a-zA-Z\\s-]{1,30}")) {
            this.last_name = last_name;
        } else {
            throw new IllegalArgumentException("Last name must be 1-30 characters long and contain alphabetic characters, spaces, or dashes");
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String[] validDepartments = {"HR", "Finance", "IT", "Sales", "General Services"};
        for (String de : validDepartments) {
            if(de.equalsIgnoreCase(department)) {
                this.department = department;
            }
            else {
                throw new IllegalArgumentException("Department must be one of HR, Finance, IT, Sales, or General Services");
            }
        }
    }

    public double getBase_salary() {
        return base_salary;
    }

    public void setBase_salary(double base_salary) {
        if (base_salary >= 20000 && base_salary <= 100000){
            this.base_salary = base_salary;
        }
        else {
            throw new IllegalArgumentException("Base Salary must be between 20000 and 100000 DKK");
        }
    }

    public String getEducational_level() {
        switch (educational_level){
            case 0: return "None";
            case 1: return "Primary";
            case 2: return "Secondary";
            case 3: return "Tertiary";
            default: throw new IllegalStateException("Invalid educational level value");
        }
    }

    public void setEducational_level(int educational_level) {
        int[] validLevels = {0, 1, 2, 3};
        for (int i : validLevels) {
            if (i == educational_level){
                this.educational_level = educational_level;
            }
            else {
                throw new IllegalArgumentException("Educational level must be either 0 (none), 1 (primary), 2 (secondary), 3 (tertiary)");
            }
        }
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(date_of_birth);

        long eighteenYearsMillis = System.currentTimeMillis() - 18L * 365 * 24 * 60 * 60 * 1000;
        Date eighteenYears = new Date(eighteenYearsMillis);

        if (!date.before(eighteenYears)){
            throw new IllegalArgumentException("Date of birth must be at least 18 years from the present day");
        }

        this.date_of_birth = date;
    }

    public Date getDate_of_employment() {
        return date_of_employment;
    }

    public void setDate_of_employment(String date_of_employment) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(date_of_employment);
        Date currentDate = new Date();

        if (!date.after(currentDate)){
            this.date_of_employment = date;
        }
        else {
            throw new IllegalArgumentException("Date of employment cannot be in the future");
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
