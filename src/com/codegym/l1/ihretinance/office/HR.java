package com.codegym.l1.ihretinance.office;

public class HR extends Employee {
    private Employee[] employees;

    public HR(String id, Employee[] employees) {
        super(id);
        this.employees = employees;
    }

    public HR(String id) {
        super(id);
    }
}
