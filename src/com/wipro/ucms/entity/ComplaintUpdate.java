package com.wipro.ucms.entity;

public class ComplaintUpdate {

    private String updateId;
    private String complaintId;
    private String date;
    private String notes;

    public ComplaintUpdate(String updateId, String complaintId,
                           String date, String notes) {
        this.updateId = updateId;
        this.complaintId = complaintId;
        this.date = date;
        this.notes = notes;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public String getNotes() {
        return notes;
    }

    public String getDate() {
        return date;
    }
}
