package br.dev.darioteodoro.cv.model;

import java.util.List;

public class Person {
    private String fullName;
    private String socialName;
    private String jobTitle;
    private List<PersonContact> contacts;

    public Person(String fullName, String jobTitle, List<PersonContact> contacts) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.contacts = contacts;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getSocialName() {
        return socialName;
    }
    public void setSocialName(String socialName) {
        this.socialName = socialName;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public List<PersonContact> getContacts() {
        return contacts;
    }
    public void setContacts(List<PersonContact> contact) {
        this.contacts = contact;
    }
    
}
