package br.dev.darioteodoro.cv.model;

public class PersonContact {
    private String logoURL;
    private String description;
    
    public String getLogoURL() {
        return logoURL;
    }
    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public PersonContact(String logoURL, String description) {
        this.logoURL = logoURL;
        this.description = description;
    }
    
}
