package com.codegym.l1.ihretinance.office;

public class Developer extends Employee {  // extends - is  || Developer is Employee
    private String programinglanguage;

    public Developer(String id, String programinglanguage) {
        super(id);// new Employee();
        this.programinglanguage = programinglanguage;
    }
}
