package Config;

import Person.Instructor;
import Person.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUSAInstructors(){
        Instructor desa = new Instructor(1L, "Desa");
        Instructor dan = new Instructor(2L, "Dan");

        return new Instructors(desa, dan);
    }


    @Bean
    public Instructors tcUKInstructors(){
        Instructor jawn = new Instructor(1L, "Jawn");
        Instructor lee = new Instructor(2L, "Lee");

        return new Instructors(jawn, lee);
    }

    @Primary
    public Instructors instructors(){
        Instructor dolio = new Instructor(1L, "Dolio");
        Instructor kris = new Instructor(2L, "Kris");

        return new Instructors(dolio, kris);
    }
}
