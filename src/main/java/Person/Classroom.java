package Person;

import Interface.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Classroom {

    private Instructors instructors;
    private Students students;

    @Autowired
    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public void hostLecture(Teacher teacher, Double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public Instructors getInstructors() {
        return this.instructors;
    }

    public Students getStudents() {
        return this.students;
    }
}