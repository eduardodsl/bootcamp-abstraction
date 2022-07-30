package bootcamp;

import java.time.LocalDate;

public class Mentorship extends Course {
    
    LocalDate date;

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return this.date;
    }

    @Override
    public double calculateXP(){
        return 0;
    }

    @Override
    public String toString(){
        return "Mentorship { "+
        "title="+this.title+", "+
        "description="+this.description+", "+
        "date="+this.date
        +" }";
    }

}
