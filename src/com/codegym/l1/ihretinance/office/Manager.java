package com.codegym.l1.ihretinance.office;

public class Manager extends Employee {
    private String[] teams;

    public Manager(String id, String[] teams) {
        super(id);
        this.teams = teams;
    }
}
