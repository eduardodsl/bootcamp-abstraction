package bootcamp;

public abstract class Content {

    protected static final double DEFAULT_XP = 10d;

    protected String title;
    protected String description;

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

    public abstract double calculateXP();

}
