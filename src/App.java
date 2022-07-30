import java.time.LocalDate;

import bootcamp.Course;
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

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship);
    }
}
