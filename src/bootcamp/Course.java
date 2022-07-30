package bootcamp;

public class Course {
    
    private String title;
    private String description;
    private int duration;
    
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

    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public String toString(){
        return "Course { "+
        "title="+this.title+", "+
        "description="+this.description+", "+
        "duration="+this.duration
        +" }";
    }

}
