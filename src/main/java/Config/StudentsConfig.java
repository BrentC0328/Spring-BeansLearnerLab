package Config;

import Person.Classroom;
import Person.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {

@Bean(name = "students")
    public Students currentStudents(){
    return Classroom.getStudents();
}

public Students previousStudents(){
    return null;

}


}
