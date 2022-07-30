import java.time.LocalDate;

import bootcamp.Bootcamp;
import bootcamp.Course;
import bootcamp.Dev;
import bootcamp.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course();

        course1.setTitle("curso java");
        course1.setDescription("descrição curso java");
        course1.setDuration(8);

        Course course2 = new Course();

        course2.setTitle("curso javascript");
        course2.setDescription("descrição curso javascript");
        course2.setDuration(10);

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("mentoria de java");
        mentorship.setDescription("descrição mentoria java");
        mentorship.setDate(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);

        Dev devEduardo = new Dev();
        devEduardo.setName("Eduardo");
        devEduardo.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed Content: "+devEduardo.getSubscribedContent());
        devEduardo.progress();
        System.out.println("Remaining Content: "+devEduardo.getSubscribedContent());
        System.out.println("Completed Content: "+devEduardo.getCompletedContent());

        Dev devJoao = new Dev();
        devJoao.setName("João");
        devJoao.subscribeToBootcamp(bootcamp);
        System.out.println("Subscribed Content: "+devJoao.getSubscribedContent());
        devJoao.progress();
        System.out.println("Remaining Content: "+devJoao.getSubscribedContent());
        System.out.println("Completed Content: "+devJoao.getCompletedContent());

    }
}
