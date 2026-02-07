package com.wipro.ucms.service;

import java.util.ArrayList;

import com.wipro.ucms.entity.*;
import com.wipro.ucms.util.*;

public class ComplaintService {

    ArrayList<Complaint> complaints;
    ArrayList<Technician> technicians;
    ArrayList<ComplaintUpdate> updates;

    public ComplaintService(ArrayList<Complaint> complaints,
                            ArrayList<Technician> technicians,
                            ArrayList<ComplaintUpdate> updates) {
        this.complaints = complaints;
        this.technicians = technicians;
        this.updates = updates;
    }

    public void registerComplaint(Complaint c) {
        complaints.add(c);
    }

    public Complaint findComplaint(String complaintId)
            throws ComplaintNotFoundException {
        for (Complaint c : complaints) {
            if (c.getComplaintId().equals(complaintId))
                return c;
        }
        throw new ComplaintNotFoundException("Complaint not found");
    }

    public Technician findTechnician(String technicianId)
            throws TechnicianNotFoundException {
        for (Technician t : technicians) {
            if (t.getTechnicianId().equals(technicianId))
                return t;
        }
        throw new TechnicianNotFoundException("Technician not found");
    }

    public void assignTechnician(String complaintId, String technicianId)
            throws ComplaintNotFoundException, TechnicianNotFoundException {

        Complaint c = findComplaint(complaintId);
        Technician t = findTechnician(technicianId);

        c.setTechnicianId(t.getTechnicianId());
        c.setStatus("IN_PROGRESS");
    }

    public void updateComplaintStatus(String complaintId, String newStatus)
            throws ComplaintNotFoundException {

        Complaint c = findComplaint(complaintId);
        c.setStatus(newStatus);
    }

    public void addComplaintUpdate(ComplaintUpdate update)
            throws ComplaintNotFoundException {

        findComplaint(update.getComplaintId());
        updates.add(update);
    }

    public ArrayList<ComplaintUpdate> getComplaintHistory(String complaintId)
            throws ComplaintNotFoundException {

        findComplaint(complaintId);
        ArrayList<ComplaintUpdate> list = new ArrayList<>();

        for (ComplaintUpdate u : updates) {
            if (u.getComplaintId().equals(complaintId))
                list.add(u);
        }
        return list;
    }

    public String generateComplaintSummary(String complaintId)
            throws ComplaintNotFoundException {

        Complaint c = findComplaint(complaintId);

        return "Complaint ID: " + c.getComplaintId() +
               "\nCitizen: " + c.getCitizenName() +
               "\nCategory: " + c.getCategory() +
               "\nStatus: " + c.getStatus() +
               "\nTechnician: " + c.getTechnicianId();
    }
}
