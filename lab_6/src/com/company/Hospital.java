package com.company;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Department> departmentslist = new ArrayList<>();

    public void addDepartment(Department d){
        departmentslist.add(d);
    }
}
