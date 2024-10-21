package br.dev.darioteodoro.cv.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EducationPeriod {

    private LocalDate startDate;
    private LocalDate endDate;
    private Period period;

    public EducationPeriod(LocalDate startDate, LocalDate endDate){
        this.startDate = startDate;
        this.endDate = endDate;
        if(isValidClosePeriod(startDate,endDate)){
            period = Period.between(startDate, endDate);
        }
    }

    public String getPeriodDescription() {
        if(period == null){
            period = Period.between(startDate, LocalDate.now());
        }
        return getStartDate() + " - " +
                getEndDate() +" ("+
                (period.getYears()==0 ? "" : period.getYears() + " yrs " )+
                (period.getDays()<15 ? period.getMonths() : period.getMonths()+1)+" mos ) ";
    }

    private String getStartDate() {
        return startDate.format(DateTimeFormatter.ofPattern("MM/yyyy"));
    }

    private String getEndDate() {
        if(endDate == null){
            return "Present";
        }
        return endDate.format(DateTimeFormatter.ofPattern("MM/yyyy"));
    }

    private boolean isValidClosePeriod(LocalDate startDate, LocalDate endDate) {
        return startDate != null && endDate != null
        && startDate.isBefore(endDate);
    }

}
