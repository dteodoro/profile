package br.dev.darioteodoro.cv.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class WorkRole {
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Period period;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(final LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(final LocalDate endDate) {
        if(startDate == null) throw new IllegalArgumentException("Start date cannot be null");
        this.endDate = endDate;
        period = Period.between(startDate, endDate);
    }

    public Period getPeriod() {
        if(startDate == null) throw new IllegalArgumentException("Start date and end date cannot be null");
        if(endDate == null){
            period = Period.between(startDate, LocalDate.now());
        }else{
            period = Period.between(startDate, endDate);
        }
        return period;
    }

    public String getPeriodDescription() {
        return getStartDate().format(DateTimeFormatter.ofPattern("MM/yyyy")) + " - " +
                (getEndDate()==null? "present": getEndDate().format(DateTimeFormatter.ofPattern("MM/yyyy"))) +" ("+
                (getPeriod().getYears()==0 ? "" : getPeriod().getYears() + " yrs " )+
                (getPeriod().getDays()<15 ? getPeriod().getMonths() : getPeriod().getMonths()+1)+" mos ) ";
    }
}
