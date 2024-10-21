package br.dev.darioteodoro.cv.model;

import java.util.List;

public class WorkExperience {
    private final List<Work> works;

    public WorkExperience(final List<Work> works) {
        this.works = works;
    }

    public List<Work> getWorks() {
        return works;
    }

}
