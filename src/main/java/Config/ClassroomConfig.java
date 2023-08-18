package Config;

import Person.Classroom;
import Person.Instructor;
import Person.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {



    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(){
        StudentsConfig studentsConfig = new StudentsConfig();
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        return new Classroom(instructorsConfig.instructors(), studentsConfig.currentStudents());
    }

    @Bean
    @DependsOn({"instructors", "students"})
    public Classroom previousCohort(){
        StudentsConfig studentsConfig = new StudentsConfig();
        InstructorsConfig instructorsConfig = new InstructorsConfig();
        return new Classroom(instructorsConfig.instructors(), studentsConfig.previousStudents());
    }
}
