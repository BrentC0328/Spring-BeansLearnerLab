package Alumni;

import Config.ClassroomConfig;
import Person.Instructors;
import Person.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
@Autowired

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni() {

    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }
    @Bean
    public void exectuteBootcamp(){
        for (Student student : currentCohort())
    }
}