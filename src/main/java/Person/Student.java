package Person;

import Interface.Learner;

public class Student extends Person implements Learner {

    private Double totalStudyTime;


    @Override
    public void learn(Double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
