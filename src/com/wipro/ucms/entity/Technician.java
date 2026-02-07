package com.wipro.ucms.entity;

public class Technician {

    private String technicianId;
    private String name;
    private String department;

    public Technician(String technicianId, String name, String department) {
        this.technicianId = technicianId;
        this.name = name;
        this.department = department;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

