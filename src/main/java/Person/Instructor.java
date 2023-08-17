package Person;

import Interface.Learner;
import Interface.Teacher;

public class Instructor extends Person implements Teacher {
    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours) {
        int counter = 0;
        for(Learner learner : learners){
            counter++;
        }
        Double splitLearnedTime = numberOfHours / counter;
        for(Learner learner : learners){
            learner.learn(splitLearnedTime);
        }
    }
}
