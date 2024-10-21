package br.dev.darioteodoro.cv.model;

public class Education {
    private String degree;
    private String schollName;
    private String schollLocation;
    private EducationPeriod period;
    
    public Education(String degree, String schollName, String schollLocation, EducationPeriod period) {
        this.degree = degree;
        this.schollName = schollName;
        this.schollLocation = schollLocation;
        this.period = period;
    }

    public String getDegree() {
        return degree;
    }

    public String getSchollName() {
        return schollName;
    }

    public String getSchollLocation() {
        return schollLocation;
    }

    public EducationPeriod getPeriod() {
        return period;
    }

    
}
