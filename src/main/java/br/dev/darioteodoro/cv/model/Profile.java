package br.dev.darioteodoro.cv.model;

public class Profile {
    private String description;
    private Person person;
    private Acknowledge acknowledge;
    private WorkExperience workExperiece;

    public Profile(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    public WorkExperience getWorkExperience() {
        return workExperiece;
    }
    public void setWorkExperience(WorkExperience workExperiece) {
        this.workExperiece = workExperiece;
    }

    public Acknowledge getAcknowledge() {
        return acknowledge;
    }

    public void setAcknowledge(Acknowledge acknowledge) {
        this.acknowledge = acknowledge;
    }
    
}
