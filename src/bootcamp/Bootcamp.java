package bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    
    private String name;
    private String description;
    private final LocalDate startDate = LocalDate.now();
    private final LocalDate finalDate = startDate.plusDays(45);
    
    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs){
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Dev> getSubscribedDevs(){
        return subscribedDevs;
    }

    public void setContents(Set<Content> contents){
        this.contents = contents;
    }

    public Set<Content> getContents(){
        return this.contents;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) &&
        Objects.equals(description, bootcamp.description) &&
        Objects.equals(startDate, bootcamp.startDate) &&
        Objects.equals(finalDate, bootcamp.finalDate) &&
        Objects.equals(subscribedDevs, bootcamp.subscribedDevs) &&
        Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            startDate,
            finalDate,
            subscribedDevs,
            contents
        );
    }

}
