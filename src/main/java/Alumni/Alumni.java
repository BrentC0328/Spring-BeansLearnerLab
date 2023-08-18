package Alumni;

import Config.ClassroomConfig;
import Person.Classroom;
import Person.Instructors;
import Person.Students;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
@Autowired

    private Students students;
    private Instructors instructors;

    @Autowired
    public Alumni(@Qualifier ("previousCohort") Classroom classroom) {
        this.students = classroom.getStudents();
        this.instructors = classroom.getInstructors();

    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

}