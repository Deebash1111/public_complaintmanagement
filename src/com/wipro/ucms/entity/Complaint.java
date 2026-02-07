package com.wipro.ucms.entity;

public class Complaint {

    private String complaintId;
    private String citizenName;
    private String category;
    private String description;
    private String status;
    private String technicianId;

    public Complaint(String complaintId, String citizenName, String category,
                     String description, String status, String technicianId) {
        this.complaintId = complaintId;
        this.citizenName = citizenName;
        this.category = category;
        this.description = description;
        this.status = status;
        this.technicianId = technicianId;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public String getCitizenName() {
        return citizenName;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getTechnicianId() {
        return technicianId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTechnicianId(String technicianId) {
        this.technicianId = technicianId;
    }
}

