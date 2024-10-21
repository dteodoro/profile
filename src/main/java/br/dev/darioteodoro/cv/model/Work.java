package br.dev.darioteodoro.cv.model;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Work {

    private String companyName;
    private String companyLocation;
    List<WorkRole> workRoles;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(final String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public List<WorkRole> getWorkRoles() {
        return workRoles;
    }

    public void setWorkRoles(final List<WorkRole> workRoles) {
        this.workRoles = workRoles;
    }

    public String getFullPeriod(){
        final boolean present = workRoles.stream().anyMatch(wr -> wr.getEndDate() == null);
        LocalDate minStartDate = workRoles.stream().map(WorkRole::getStartDate).min(LocalDate::compareTo).orElse(null);
        LocalDate endDate = null;
        if(present){
            endDate = LocalDate.now();
        }else {
            endDate = workRoles.stream().map(WorkRole::getEndDate).max(LocalDate::compareTo).orElse(null);
        }
        Period period = Period.between(minStartDate, endDate);

        return minStartDate.format(DateTimeFormatter.ofPattern("MM/yyyy")) + " - " +
                (present ? "Present" : endDate.format(DateTimeFormatter.ofPattern("MM/yyyy"))) + " (" +
                (period.getYears()==0 ? "" : period.getYears()+" yrs ") +
                (period.getDays()<15 ? period.getMonths() : period.getMonths()+1)+" mos ) ";
    }
}
