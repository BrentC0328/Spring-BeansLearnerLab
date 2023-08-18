import Config.ClassroomConfig;
import Config.StudentsConfig;
import Person.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = StudentsConfig.class)
public class StudentConfigTest {



@Test
    public void currentStudentsTest(){
        StudentsConfig studentConfig = new StudentsConfig();
        Student expected = new Student(1L, "Brent");

        Student actual = studentConfig.currentStudents().findById(1L);

        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void previousStudentsTest(){
        StudentsConfig studentConfig = new StudentsConfig();
        Student expected = new Student(1L, "Danielle");

        Student actual = studentConfig.previousStudents().findById(1L);

        Assert.assertEquals(expected.toString(), actual.toString());
    }


}
