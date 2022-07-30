package bootcamp;

import java.time.LocalDate;

public class Mentorship {
    
    String title;
    String description;
    LocalDate date;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return this.date;
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
