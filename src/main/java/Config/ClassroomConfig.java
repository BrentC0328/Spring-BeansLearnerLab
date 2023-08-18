package Config;

import Person.Classroom;
import Person.Instructors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {

    private final Instructors instructors;
    private final StudentsConfig studentsConfig;

    @Autowired
    public ClassroomConfig(Instructors instructors, StudentsConfig studentsConfig) {
        this.instructors = instructors;
        this.studentsConfig = studentsConfig;
    }

    @Bean
    public Classroom currentCohort() {
        return new Classroom(instructors, studentsConfig.previousStudents());
    }

    @Bean
    public Classroom previousCohort() {
        return new Classroom(instructors, studentsConfig.previousStudents());
    }


}