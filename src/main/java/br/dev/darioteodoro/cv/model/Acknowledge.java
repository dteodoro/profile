package br.dev.darioteodoro.cv.model;

import java.util.List;

public class Acknowledge {
    private List<Education> educations;
    private List<Language> Languages;
    private List<Skill> skill;
    
    public List<Education> getEducations() {
        return educations;
    }
    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }
    public List<Language> getLanguages() {
        return Languages;
    }
    public void setLanguages(List<Language> languages) {
        Languages = languages;
    }
    public List<Skill> getSkill() {
        return skill;
    }
    public void setSkill(List<Skill> skill) {
        this.skill = skill;
    }
    
}
