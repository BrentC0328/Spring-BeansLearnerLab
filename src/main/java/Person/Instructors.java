package Person;

import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class Instructors extends People<Instructor> {
    public Instructors(Instructor... instructors){
        super(instructors);
    }

    @Override
    public Iterator<Instructor> iterator() {
        return null;
    }
}
