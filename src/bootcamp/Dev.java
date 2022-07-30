package bootcamp;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev{

    private String name;
    private Set<Content> subscribedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void subscribeToBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.completedContent.add(content.get());
            this.subscribedContent.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    
    public double calculateXP(){
        return this.completedContent
            .stream()
            .mapToDouble(content -> content.calculateXP())
            .sum();
    }

    public void setSubscribedContent(Set<Content> subscribedContent){
        this.subscribedContent = subscribedContent;
    }

    public void setCompletedContent(Set<Content> completedContent){
        this.completedContent = completedContent;
    }

    public Set<Content> getSubscribedContent(){
        return this.subscribedContent;
    }

    public Set<Content> getCompletedContent(){
        return this.completedContent;
    }


    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) &&
        Objects.equals(subscribedContent, dev.subscribedContent) &&
        Objects.equals(completedContent, dev.completedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContent);
    }

}