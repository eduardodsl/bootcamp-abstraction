package bootcamp;

public class Course extends Content {
    
    private int duration;
    
    public void setDuration(int duration){
        this.duration = duration;
    }

    public int getDuration(){
        return this.duration;
    }

    @Override
    public double calculateXP(){
        return DEFAULT_XP * duration;
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
