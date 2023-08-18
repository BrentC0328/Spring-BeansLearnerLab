package Config;

import Person.Classroom;
import Person.Student;
import Person.Students;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentsConfig {

@Bean(name = "students")
    public Students currentStudents(){
    Student brent = new Student(1L, "Brent");
    Student min = new Student(2L, "Min");
    Student liz = new Student(3L, "Liz");
    Student joe = new Student(4L, "Joe");
    return new Students(brent, min, liz, joe);
}

public Students previousStudents(){
    Student danielle = new Student(1L, "Danielle");
    Student olimade = new Student(2L, "Olimade");
    Student surabhi = new Student(3L, "Surabhi");
    Student maggie = new Student(4L, "Maggie");
    return new Students(danielle, olimade, surabhi, maggie);

}


}
