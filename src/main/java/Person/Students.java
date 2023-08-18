package Person;

import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Component
public class Students extends People<Student> {


    public Students(Student... students) {
        super(students);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }
}
